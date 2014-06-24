/**
 * 
 */
package br.com.motivo.sga.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.motivo.sga.model.Institution;
import br.com.motivo.sga.repository.InstitutionRepository;

/**
 * @author ferrete
 *
 */
@Service
public class InstitutionService {
	
	Logger logger =  Logger.getLogger(this.getClass());
	
	@Autowired
	InstitutionRepository institutionRepository;
	
	/**
	 * @param institutionId
	 * @return
	 */
	@Transactional(readOnly = true)
	public Institution findById(final Integer institutionId){
		
		Institution institution = null;
		
		try {
			institution = institutionRepository.findOne(institutionId);
			
		} catch (Exception e) {
			logger.error("", e);
		}
		return institution;
	}
	
	/**
	 * @param institution
	 */
	@Transactional
	public void saveOrUpdate(final Institution institution){
		
		try {
			institutionRepository.saveAndFlush(institution);
			
		} catch (Exception e) {
			logger.error("", e);
		}
	}
	
	/**
	 * @param institutionId
	 */
	@Transactional
	public void delete(final Integer institutionId){
		
		try {
			institutionRepository.delete(institutionId);
			
		} catch (Exception e) {
			logger.error("", e);
		}
	}
	
	/**
	 * @return
	 */
	@Transactional(readOnly = true)
	public List<Institution> findAll() {
		
		List<Institution> list = null;
		
		try {
			list = institutionRepository.findAll();
			
		} catch (Exception e) {
			logger.error("", e);
		}
		return list;
	}

}
