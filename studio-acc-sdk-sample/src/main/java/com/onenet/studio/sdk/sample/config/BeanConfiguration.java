package com.onenet.studio.sdk.sample.config;

import com.onenet.studio.acc.sdk.OpenApi;
import com.onenet.studio.acc.sdk.OpenApiFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: fanhaiqiu
 * @date: 2020/12/24
 */
@Configuration
public class BeanConfiguration {

    @Value("${sdk.api.url}")
    private String url;

    @Value("${sdk.api.product-id}")
    private String productId;

    @Value("${sdk.api.access-key}")
    private String accessKey;

    @Bean
    public OpenApiFactory openApiFactory() {
        OpenApiFactory factory = new OpenApiFactory(url, productId, accessKey);
        return factory;
    }
}
