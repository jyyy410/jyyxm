package com.niit.jyy;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
public static Object reponseJson(Integer status ,String message ,JSONObject jsonObject) {
	JSONObject string=(JSONObject) JSONObject.toJSON(new ResoJson(status, message, jsonObject));
	return 	string;

			

}

}
