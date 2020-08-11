package com.merge;

import org.springframework.stereotype.Service;

@Service
public class Serviceimpl {
	
	public String getName(String name) {
		
		return "Hello"+name;
	}
	
	public String getNameAndId(String name, String id) {
		
		return "Hello"+name+" your id is "+id;
	}

}
