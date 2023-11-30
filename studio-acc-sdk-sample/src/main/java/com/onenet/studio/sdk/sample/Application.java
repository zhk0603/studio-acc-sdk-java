package com.onenet.studio.sdk.sample;

import com.onenet.studio.acc.sdk.annotations.ThingsModelConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: fanhaiqiu
 * @date: 2020/12/22
 */
@SpringBootApplication
//@ThingsModelConfiguration("model-SanitationTruck.json")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
