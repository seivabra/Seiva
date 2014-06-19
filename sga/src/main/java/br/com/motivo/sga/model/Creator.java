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
public class Creator implements Serializable {

	@Id
	@Column(name = "idcreator")
	private Integer id;

	private String type;

	private String name;

	private String notes;

	//TODO CHECAR TIPO DATA
	// birthdate VARCHAR(45) NULL DEFAULT NULL,

	// deathdate VARCHAR(45) NULL DEFAULT NULL,

	private String nationality;

	private String maincontact;

	private Institution institution;

}
