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
public class Module implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idmodule")
	private Integer id;

	private String moname;

	private String mokeyname;

	private Institution institution;

}
