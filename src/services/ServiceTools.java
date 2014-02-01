package services;

import org.json.JSONObject;

public class ServiceTools {
	
	public static JSONObject error(String message, int code) {
		JSONObject json = new JSONObject();
		try {
			json.put("status", "error");
			json.put("code", code);
			json.put("error_msg", message);
		}
		catch (Exception e) {
			return null;
		}
		
		return json;
	}
	
	public static JSONObject ok() {
		JSONObject json = new JSONObject();
		try {
			json.put("status", "ok");
		}
		catch (Exception e) {
			return null;
		}
		
		return json;
	}

}
