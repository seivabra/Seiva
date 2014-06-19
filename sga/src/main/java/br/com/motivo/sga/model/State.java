package br.com.motivo.sga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author ferrete
 * 
 */
@Entity
public class State implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idstate")
	private Integer id;

	private String state;

	private String statecode;

	private Country country;

}
