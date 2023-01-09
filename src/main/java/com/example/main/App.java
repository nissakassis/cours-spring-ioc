package com.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.config.AppConfig;
import com.example.config.MyComponent;
import com.example.models.User;
import com.example.services.GreetingService;
import com.example.services.Language;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// charger les beans declarés dans factory
		//	et	recupere l'instance du bean initialisé dans la factory
		// le context est declaré dans application.COntextt

		// charger le contexte qui va recupérer les objets selon l'id
		//Ici on charge le contexte de l'application via le fichier xml
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// recupere l'instance du bean initialisée dans le bean
		User u1 = context.getBean("user", User.class);
		System.out.println(u1);
		
		// Ici on charge le contexte de l'application via la class Appconfig annoté par @Configuration
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
		// ci dessus on peut mettre le type de contexte2 à gauche de l'= seulement ApplicationContext
		// au lieu de AnnotationConfigApplicationContext
		
		User u2 = context2.getBean("user1", User.class);
		System.out.println(u2);
		
		Language l1 = (Language)context2.getBean("language");
		System.out.println("language : " + l1); // recupère nom du package
		// on peut faire l1.betBye()
		System.out.println("language : " + l1.getBye());
		
		
		GreetingService greetingService = (GreetingService) context2.getBean("greetingService");
		greetingService.sayHello();
		
		MyComponent component = context2.getBean("myComponent", MyComponent.class);
		component.showAppInfo();
		
	}
}