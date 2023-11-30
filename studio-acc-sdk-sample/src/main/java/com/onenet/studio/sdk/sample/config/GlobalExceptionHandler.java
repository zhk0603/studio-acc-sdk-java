package com.onenet.studio.sdk.sample.config;

import com.onenet.studio.sdk.sample.models.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * GlobalExceptionHandler
 *
 * @author zhk
 * @date 2023/11/29 17:29
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseDto handleException(Exception e, HttpServletRequest request)
    {
        String requestURI = request.getRequestURI();
        log.error("请求地址'{}',发生系统异常.", requestURI, e);
        return new ResponseDto(1, e.getMessage());
    }
}
