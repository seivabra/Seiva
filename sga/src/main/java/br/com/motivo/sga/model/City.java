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
public class City implements Serializable {

	@Id
	@Column(name = "idcity")
	private Integer id;

	private String city;

	private String citycode;
	//TODO CHECAR TIPO BOOLEAN
	// citypublic BIT(1) NULL DEFAULT NULL,

	private State state;

	private Institution institution;

}
