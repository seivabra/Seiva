/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class History implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idhistory")
	private Integer id;

	private String type;

	private String description;

	// TODO CHECAR TIPO DATA
	private String date;

	private String actor;

	private BigDecimal cost;

	private Boolean isPublic;

	private Item item;

	private Institution institution;

	private Exposition exposition;

	private Creator creator;

}
