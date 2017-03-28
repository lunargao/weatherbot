package com.lunar.bot;

import com.sugon.cloudview.cloudmanager.framework.rest.ApiHelper;

import net.sf.json.JSONObject;

public class WeatherRestfulService {
    /**
     * @function:restful接口调用
     * @author gaohj
     * @param void
     * @throws Exception
     */
    public static String getLuisJsonRestful(String str) {
        String response = "";
        try {
            System.out.println("restful接口调用，");
            response = ApiHelper
                    .doGet("https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + str + "&verbose=true", String.class);
            System.out.println(
                    "https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + str + "&verbose=true");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("接口调用失败" + e.getMessage());
        }
        return response;
    }

    public static String getthinkpageRestful(String str) {
        String response = "";
        try {
            System.out.println("restful接口调用，");
            response = ApiHelper
                    .doGet("https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + str + "&verbose=true", String.class);
            System.out.println(
                    "https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + str + "&verbose=true");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("接口调用失败" + e.getMessage());
        }
        return response;
    }
    public static String getsonRestful(String urlType, String param) {
        String response = "";
        try {
            System.out.println("restful接口调用，");
            response = ApiHelper
                    .doGet("https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + param + "&verbose=true", String.class);
            System.out.println(
                    "https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=949a59786fe840d494222f78be7bb5c5&q="
                            + param + "&verbose=true");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("接口调用失败" + e.getMessage());
        }
        return response;
    }

    public static String parseJson(String str, String intent) {
        JSONObject jsonObject = JSONObject.fromObject(str);
        JSONObject json = (JSONObject) jsonObject.get(intent);
        String strJson = (String) json.get("intent");
        return strJson;
    }

    /**
     * luis urlType=https://westus.api.cognitive.microsoft.com/luis/v2.0/apps/
     * b7cd5489-4d92-4fd6-b6aa-2e5143b98281?subscription-key=
     * 949a59786fe840d494222f78be7bb5c5&q=
     * 
     * @param args
     */
    public static void main(String[] args) {
        String response = getLuisJsonRestful("PM指数");
        String intent = parseJson(response, "topScoringIntent");
        System.out.println(intent);
    }
}
