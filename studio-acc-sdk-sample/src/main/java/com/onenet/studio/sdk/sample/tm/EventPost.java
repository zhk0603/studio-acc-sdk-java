//package com.onenet.studio.sdk.sample.tm;
//
//import com.onenet.studio.acc.sdk.OpenApi;
//import com.onenet.studio.acc.sdk.OpenApiExtention;
//import com.onenet.studio.acc.sdk.dto.GeoLocationStructDTO;
//import com.onenet.studio.acc.sdk.dto.LocationStructDTO;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//
///**
// * 物模型事件测试类
// *
// * @author wjl
// * @date 2020-12-25
// */
//@Component
//public class EventPost {
//
//    @Resource
//    private OpenApi openApi;
//
//    @PostConstruct
//    public void init() {
//        OpenApiExtention extention = new OpenApiExtention(openApi);
//        eventUp(extention);
//    }
//
//    /**
//     * 模拟事件上报
//     *
//     * @author wjl
//     * @date 2020/12/29
//     * @param extention 物模型扩展API
//     **/
//    public void eventUp(OpenApiExtention extention) {
//
//
//        try {
//            LocationStructDTO geoLocation = new LocationStructDTO();
//            geoLocation.setAltitude(11D);
//            geoLocation.setLatitude(22.2D);
//            geoLocation.setLongitude(113D);
//            int result = extention.LocationPropertyUpload(geoLocation, 1000);
//            System.out.println("event upload result : " + result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
