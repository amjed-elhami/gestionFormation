package com.amjed.formations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amjed.formations.services.FormationService;
import com.amjed.formations.services.FormationService;
import com.amjed.formations.entities.Formation;

@SpringBootApplication
public class FormationApplication  implements CommandLineRunner{

	@Autowired
	FormationService formationService; 
	
	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		formationService.saveFormation(new Formation("java", " apprendre les base de POO", 2600.0, new Date()));
		formationService.saveFormation(new Formation("python", " description formation python", 3000.0, new Date()));
		formationService.saveFormation(new Formation("symfony", " description formation symfony", 1200.0, new Date()));
	}


}
