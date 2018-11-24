package com.zjmeow.bboard;

import com.zjmeow.bboard.dao.SongMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BboardApplicationTests {
    @Autowired
    SqlSession session;
    @Test
    public void contextLoads() {
        System.out.println(session.getMapper(SongMapper.class));
    }

}
