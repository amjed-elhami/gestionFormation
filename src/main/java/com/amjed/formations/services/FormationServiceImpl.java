package com.amjed.formations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.amjed.formations.entities.Formation;
import com.amjed.formations.repos.FormationRepository;

public class FormationServiceImpl implements FormationService {
    
	@Autowired
	FormationRepository formationRepository;
	
	@Override
	public Formation saveFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public Formation updateFormation(Formation f) {
		return formationRepository.save(f);
	}

	@Override
	public void deleteFormation(Formation f) {
		formationRepository.delete(f);
	}

	@Override
	public void deleteFormationById(Long id) {
		formationRepository.deleteById(id);
	}

	@Override
	public Formation getFormation(Long id) {
		return formationRepository.findById(id).get();
	}

	@Override
	public List<Formation> getAllFormations() {
		return formationRepository.findAll();
	}

	@Override
	public Page<Formation> getAllFormationsParPage(int page, int size) {
		return formationRepository.findAll(PageRequest.of(page, size));
	}

	
}
