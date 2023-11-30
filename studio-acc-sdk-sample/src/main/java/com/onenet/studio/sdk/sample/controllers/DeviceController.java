package com.onenet.studio.sdk.sample.controllers;

import com.alibaba.fastjson.JSON;
import com.onenet.studio.acc.sdk.OpenApi;
import com.onenet.studio.acc.sdk.OpenApiExtention;
import com.onenet.studio.acc.sdk.OpenApiFactory;
import com.onenet.studio.sdk.sample.models.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeviceController
 *
 * @author zhk
 * @date 2023/11/29 15:00
 */

@RequestMapping("/device")
@RestController
public class DeviceController {

    @Autowired
    OpenApiFactory openApiFactory;

    /**
     * 设备属性上报接口
     *
     * @return
     */
    @PostMapping("/thing/property/post")
    public ResponseDto postProperty(@RequestParam String devKey, @RequestBody Map<String, Object> postBody) throws Exception {

        OpenApi openApi = openApiFactory.create(devKey);

        Map<String, Object> oneJson = new HashMap<>();
        long now = System.currentTimeMillis();
        String id = String.valueOf(now);
        oneJson.put("id", id);
        oneJson.put("version", "1.0");
        Map<String, Object> params = new HashMap<>();
        if (postBody != null && !postBody.isEmpty()) {
            Map<String, Object> locationMap = new HashMap<>();
            locationMap.put("value", JSON.toJSON(postBody));
            locationMap.put("time", now);
            params.put("Location", locationMap);
        }
        oneJson.put("params", params);
        String oneJsonStr = JSON.toJSONString(oneJson);
        int res = openApi.propertyPost(id, oneJsonStr, 1_000);
        return new ResponseDto(res, null);
    }


    /**
     * 设备event上报接口
     *
     * @return
     */
    @PostMapping("/thing/event/post")
    public ResponseDto postEvent(@RequestParam String devKey, @RequestBody Map<String, Object> postBody) throws Exception {

        OpenApi openApi = openApiFactory.create(devKey);

        Map<String, Object> oneJson = new HashMap<>();
        long now = System.currentTimeMillis();
        String id = String.valueOf(now);
        oneJson.put("id", id);
        oneJson.put("version", "1.0");
        Map<String, Object> params = new HashMap<>();
        if (postBody != null && !postBody.isEmpty()) {
            Map<String, Object> map = new HashMap<>();
            map.put("value", JSON.toJSON(postBody));
            map.put("time", now);
            params.put("SanitationTruck", map);
        }
        oneJson.put("params", params);
        String oneJsonStr = JSON.toJSONString(oneJson);
        int res = openApi.eventPost(id, oneJsonStr, 1_000);
        return new ResponseDto(res, null);
    }
}
