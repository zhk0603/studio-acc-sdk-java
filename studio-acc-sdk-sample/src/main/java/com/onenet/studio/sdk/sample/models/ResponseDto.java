package com.onenet.studio.sdk.sample.models;

import lombok.Data;

/**
 * ResponseDto
 *
 * @author zhk
 * @date 2023/11/29 16:34
 */
@Data
public class ResponseDto {

    private Integer code;
    private String message;

    public ResponseDto(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
