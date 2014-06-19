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
public class Documentation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "iddocumentation")
	private Integer id;

	private String type;

	private String description;

	private String notes;

	private Item item;

	private Institution institution;

}
