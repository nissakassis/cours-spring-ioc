package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.models.User;
import com.example.services.French;
import com.example.services.Language;

// permet de declarer un composant configurant le contexte de l'application
@Configuration

// scanner le package là où y a des beans à injecter
@ComponentScan({"com.example.services"}) // faut lui dire ds quel pack les classes se trouvent et ca va avec 
// l'annotation  @Service

@ComponentScan({"com.example.*"})
public class AppConfig {

	// Un bean est un objet qui est instancié, assemblé et géré par le factory du spring boot
	@Bean(name = "user1")
	public User user1() {
		// on veut retourner l'iunstnce
		return new User(2, "Doe", "John", 2000);
	}
	
	// declare bean a injecter ds greeting
	@Bean(name="language")
	public Language getLanguage( ) {
		return new French();
	}
	

}
