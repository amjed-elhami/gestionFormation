package com.amjed.formations.services;

import java.util.List;
import com.amjed.formations.entities.*;
import org.springframework.data.domain.Page;


public interface FormationService {
  
	Formation saveFormation(Formation f);
	Formation updateFormation(Formation f);
	void deleteFormation(Formation f);
	void deleteFormationById(Long id);
	Formation getFormation(Long id);
	List<Formation> getAllFormations();
	
	Page<Formation> getAllFormationsParPage(int page, int size);

}
