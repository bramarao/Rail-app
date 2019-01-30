package com.subham.myrailapp.util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.spi.DirStateFactory.Result;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RailApi {
	
	private static final String KEY="KEY_";

	@Autowired
	RestTemplate restTemplate;

	public String getkey() {
		return "nvowuewwfx000";
	}

	public JSONObject callRailwayApi(String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

//		ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		
		JSONObject jsonObj = new JSONObject(APIList.PNR_STATUS_CHECK_RESULT);
		System.out.println(jsonObj);
		return jsonObj;
	}

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}

	public String buildUrl(String pnrStatusCheck, List<String> inputs) {
		String result = pnrStatusCheck;
		for (int i = 0; i < inputs.size(); i++) {
			result=result.replace("<"+KEY+i+">", inputs.get(i));
		}
		result=result.replace("APIKEY", getkey());
		return result;
	}
}
