package com.zjmeow.bboard.service.impl;

import com.zjmeow.bboard.dao.BillboardMapper;
import com.zjmeow.bboard.dao.SingerMapper;
import com.zjmeow.bboard.dao.SongMapper;
import com.zjmeow.bboard.model.po.Billboard;
import com.zjmeow.bboard.model.po.Singer;
import com.zjmeow.bboard.model.po.Song;
import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.model.vo.SingerListVO;
import com.zjmeow.bboard.model.vo.SongDetailVO;
import com.zjmeow.bboard.model.vo.SongListVO;
import com.zjmeow.bboard.service.SongService;
import com.zjmeow.bboard.util.RestResultGenerator;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.QueryBuilders;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SongServiceImpl implements SongService {
    private final SongMapper songMapper;
    private final SingerMapper singerMapper;
    private final BillboardMapper billboardMapper;
    private final ModelMapper modelMapper;
    private final ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    public SongServiceImpl(SongMapper songMapper, ModelMapper modelMapper
            , SingerMapper singerMapper
            , BillboardMapper billboardMapper
            , ElasticsearchTemplate elasticsearchTemplate) {
        this.songMapper = songMapper;
        this.modelMapper = modelMapper;
        this.singerMapper = singerMapper;
        this.billboardMapper = billboardMapper;
        this.elasticsearchTemplate = elasticsearchTemplate;
    }


    @Override
    public ApiResponse<List<SongListVO>> searchSong(String title) {
        List<Song> songs = songMapper.selectSongByTitle(title + "%");
        List<SongListVO> songListVOS = modelMapper.map(songs, new TypeToken<List<SongListVO>>() {
        }.getType());
        SearchResponse response = elasticsearchTemplate.getClient().prepareSearch("es_address_index")
                .setTypes("ADDRESS")
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                .setQuery(QueryBuilders.wildcardQuery("PINYIN_INIT", ("*" + title + "*").toLowerCase()))  //查询字段
                .setSize(40)                 //查询最大条数
                .execute().actionGet();



        return RestResultGenerator.genResult(songListVOS, "OK");
    }


    @Override
    public ApiResponse<SongDetailVO> getSongDetail(Integer id) {
        List<Singer> singers = singerMapper.selectSingerBySongId(id);
        List<Billboard> billboards = billboardMapper.selectRankBySongId(id);
        List<SingerListVO> singerListVOS = modelMapper.map(singers, new TypeToken<List<SingerListVO>>() {
        }.getType());
        List<SongDetailVO.BillboardVO> billboardListVOS = modelMapper.map(billboards, new TypeToken<List<SongDetailVO.BillboardVO>>() {
        }.getType());

        Song song = songMapper.selectSongById(id);
        SongDetailVO songDetailVO = modelMapper.map(song, SongDetailVO.class);
        songDetailVO.setSingers(singerListVOS);
        songDetailVO.setBillboards(billboardListVOS);
        log.info("" + songDetailVO);
        return RestResultGenerator.genResult(songDetailVO, "OK");
    }

}
