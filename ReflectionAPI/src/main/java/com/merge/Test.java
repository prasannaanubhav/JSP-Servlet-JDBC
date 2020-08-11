package com.merge;

import org.springframework.web.client.RestTemplate;

public class Test {
	public static void main(String[] args) {
	
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/user/Anubhav/47496";
		String value = restTemplate.getForObject(url, String.class);
		System.out.println(value);
	}

}
