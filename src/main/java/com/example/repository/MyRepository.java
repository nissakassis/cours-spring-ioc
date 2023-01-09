package com.example.repository;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public String getAppName() {
		return "Hello spring ico";
		
	}
	
	public Date getDatetimeDate () {
		return new Date();
	}

}
