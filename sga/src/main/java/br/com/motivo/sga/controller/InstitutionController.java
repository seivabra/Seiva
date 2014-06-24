/**
 * 
 */
package br.com.motivo.sga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.motivo.sga.model.Institution;
import br.com.motivo.sga.service.InstitutionService;

/**
 * @author ferrete
 *
 */
@Controller
@RequestMapping(value = "/protected/institution")
public class InstitutionController {
	
	@Autowired
	InstitutionService institutionService;
	
	@RequestMapping(value="/create")
	public ResponseEntity<?> createInstitution(@ModelAttribute("institution") Institution institution){
		
		institutionService.saveOrUpdate(institution);
		
		return null;
	}

}
