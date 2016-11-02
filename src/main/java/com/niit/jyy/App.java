package com.niit.jyy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url="http://api.map.baidu.com/telematics/v3/weather?location=杭州&output=json&ak=GOibuG427IaOMnNlyGKhwcnW2E4HkE8I";

      try {
		String str= HttpUtils.get(url);
		JSONObject jsonObject=JSONObject.parseObject(str);
		JSONArray results=(JSONArray) jsonObject.get("results");
		JSONObject result0 =(JSONObject) results.get(0);
		JSONArray weather_data =(JSONArray) result0.get("weather_data");
		JSONObject today =(JSONObject) weather_data.get(0);
		String todayweather=(String) today.get("weather");
		String todaytemperature=(String) today.get("temperature");
		Map<String, Object> responSt=new HashMap<String, Object>();
		responSt.put("weather", todayweather);
		responSt.put("temperature", todaytemperature);
		
	
		jsonObject=new JSONObject(responSt);
		System.out.println(jsonObject);
		System.out.println();
		
		//System.out.println("a"+JsonUtil.reponseJson(1, "ok",jsonObject));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
