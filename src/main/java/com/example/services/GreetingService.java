package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="greetingService")  // injecter un bean de type service dans la gactory de spring core

public class GreetingService {

	// injection de l'interface
	// recupère un bean injecté avec Autowired dans la class AppConfig
	@Autowired
	private Language language;
	
	
	public GreetingService() {
		// TODO Auto-generated constructor stub
	}
	
	public void sayHello() {
		System.out.println("Message : " + language.getHello());
	}

}
