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
public class Exposition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idexposition")
	private Integer id;

	private String location;

	private String curator;

	private String initialdate;
	// TODO CHECAR TIPO DATA
	private String enddate;

	private String description;

	private String notes;

	private String name;

	private Institution institution;

}
