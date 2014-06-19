/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class Country implements Serializable {

	@Id
	@Column(name = "idcountry")
	private Integer id;

	private String country;
	
	private String countrycode;

}
