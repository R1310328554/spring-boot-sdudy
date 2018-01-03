//package com.example.demo;
//
//import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
//
///**
// * Created by luokai on 2017/9/18.
// */
//public class HttpClientTest {
//
//    public static void main(String[] args) {
//
//
//        testMoxie();
//    }
//
//    private static void testMoxie() {
//        String url = "https://api.51datakey.com/carrier/v3/tasks/channels";
//        String bizContent = "{\"account\":\"181162733232\"}";
//
//        MoxieRequest moxieRequest = MoxieRequest.custom().setBizContent(bizContent)
//                .setResponseClass(MoxieResponse.class).build();
//        MoxieClient moxieClient = new DefaultMoxieClient(httpClient, url, authorization.getApiKey());
//
//        System.out.println(String.format(">>> 调用魔蝎URL: %s, 请求参数: %s", url, bizContent));
//        MoxieResponse response;
//        try {
//            response = moxieClient.execute(moxieRequest, HttpMethod.POST);
//        } catch (Exception e) {
//            // TODO 接口调用异常, 解析异常信息
//            MoxieApiException moxieApiException = new MoxieApiException(e);
//            System.out.println("调用魔蝎接口异常: " + moxieApiException.getMessage());
//            return;
//        }
//
//        System.out.println("调用魔蝎接口, 响应码: " + response.getResponseCode() + ", 响应结果: " + response.getResponseData());
//        JSONObject object = JSON.parseObject(response.getResponseData());
//        if (response.isSuccess()) {
//            // TODO 接口调用正常,解析结果响应参数
//            System.out.println("String carrier = " + object.getString("carrier"));
//            System.out.println("String carrierName = " + object.getString("carrier_name"));
//            System.out.println("String province = " + object.getString("province"));
//            System.out.println("String status = " + object.getIntValue("status"));
//            JSONArray jsonArray = object.getJSONArray("channels");
//
//            for (int i= 0; i < jsonArray.size(); i++) {
//                System.out.println("...index = " + i);
//                JSONObject subObject = JSON.parseObject(String.valueOf(jsonArray.get(i)));
//                System.out.println("String channel = " + subObject.getString("channel"));
//                System.out.println("String channelName = " + subObject.getString("channel_name"));
//                System.out.println("String realNameRequired = " + subObject.getString("real_name_required"));
//                System.out.println("String resetPwdSms = " + subObject.getString("reset_pwd_sms"));
//                System.out.println("String loginSmsRequired = " + subObject.getString("login_sms_required"));
//            }
//        } else {
//            // TODO 接口调用正常, 解析异常信息
//            System.out.println("String detail = " + object.getString("detail"));
//            System.out.println("String instance = " + object.getString("instance"));
//        }
//
//    }
//}
