package com.amjed.formations.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amjed.formations.services.FormationService;
import com.amjed.formations.entities.Formation;

public class FormationController {
  
	@Autowired
	FormationService formationService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	  return "createFormation";
	}
	
	@RequestMapping("/saveFormation")
	public String saveProduit(@ModelAttribute("formation") Formation formation,
	 @RequestParam("date") String date,
	 ModelMap modelMap) throws
	ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 formation.setDateAjoutFormation(dateCreation);

	Formation saveFormation = formationService.saveFormation(formation);
	String msg ="Formation enregistré avec Id "+saveFormation.getIdFormation();
	modelMap.addAttribute("msg", msg);
	return "createFormation";
	}
	
	@RequestMapping("/ListeFormations")
	public String listeProduits(ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	Page<Formation> formations = formationService.getAllFormationsParPage(page, size);
	modelMap.addAttribute("formations", formations);
	modelMap.addAttribute("pages", new int[formations.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	return "listeFormations";
	}
	
	
	@RequestMapping("/supprimerFormation")
	public String supprimerProduit(@RequestParam("id") Long id,
	ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	formationService.deleteFormationById(id);
	Page<Formation> formations = formationService.getAllFormationsParPage(page,
	size);
	modelMap.addAttribute("Formations", formations);
	modelMap.addAttribute("pages", new int[formations.getTotalPages()]);
	modelMap.addAttribute("currentPage", formations);
	modelMap.addAttribute("size", size);
	return "listeFormations" ;
	}
	
	@RequestMapping("/modifierFormation")
	public String editerProduit(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Formation p= formationService.getFormation(id);
	modelMap.addAttribute("formation", p);
	return "editerFormation";
	}
	
	@RequestMapping("/updateFormation")
	public String updateProduit(@ModelAttribute("formation") Formation formation,
	@RequestParam("date") String date,ModelMap modelMap) throws ParseException
	{
		//conversion de la date
		 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		 Date dateCreation = dateformat.parse(String.valueOf(date));
		 formation.setDateAjoutFormation(dateCreation);

		 formationService.updateFormation(formation);
		 List<Formation> prods = formationService.getAllFormations();
		 modelMap.addAttribute("Formations", prods);
		return "listeFormations"; 
    }

}
