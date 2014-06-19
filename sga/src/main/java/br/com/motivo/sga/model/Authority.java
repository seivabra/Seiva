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
public class Authority implements Serializable {

	@Id
	@Column(name = "idauthority")
	private Integer id;

	private String name;
	//TODO CHECAR TIPO BOOLEAN
	// audisplay BIT(1) NULL DEFAULT NULL,
	// aulist BIT(1) NULL DEFAULT NULL,
	// auinsert BIT(1) NULL DEFAULT NULL,
	// auupdate BIT(1) NULL DEFAULT NULL,
	// auread BIT(1) NULL DEFAULT NULL,
	// audelete BIT(1) NULL DEFAULT NULL,
	// auexecute BIT(1) NULL DEFAULT NULL,
	// auexport BIT(1) NULL DEFAULT NULL,
	
	private Module module;
	
	private Institution institution;
}
