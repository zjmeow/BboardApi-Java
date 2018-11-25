package com.zjmeow.bboard.exception;


import com.zjmeow.bboard.enums.ResponseErrorEnum;
import com.zjmeow.bboard.model.vo.ApiResponse;
import com.zjmeow.bboard.util.RestResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.UnexpectedTypeException;

/**
 * @description: 错误统一处理
 **/
@ControllerAdvice(annotations = RestController.class)
public class RestExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    /**
     * bean校验未通过异常
     *
     * @see javax.validation.Valid
     * @see org.springframework.validation.Validator
     * @see org.springframework.validation.DataBinder
     */
    @ExceptionHandler(UnexpectedTypeException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private <T> ApiResponse<T> illegalParamsExceptionHandler(UnexpectedTypeException e) {
        LOGGER.error("--------->请求参数不合法!", e);
        return RestResultGenerator.genErrorResult(ResponseErrorEnum.ILLEGAL_PARAMS);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public <T> ApiResponse<T> jsonErrorHandler(Exception e) throws Exception {
        LOGGER.error("--------->请求参数不合法!", e);
        return RestResultGenerator.genErrorResult(ResponseErrorEnum.ILLEGAL_PARAMS);
    }
}
