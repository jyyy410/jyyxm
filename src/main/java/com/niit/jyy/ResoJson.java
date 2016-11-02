package com.niit.jyy;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ResoJson {
	private Integer status;
	
	private JSONObject data;
	private String message;
	public ResoJson(Integer status, String message, JSONObject data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	public final Integer getStatus() {
		return status;
	}
	public final void setStatus(Integer status) {
		this.status = status;
	}
	public final String getMessage() {
		return message;
	}
	public final void setMessage(String message) {
		this.message = message;
	}
	public final JSONObject getData() {
		return data;
	}
	public final void setData(JSONObject data) {
		this.data = data;
	}
	
	
}
