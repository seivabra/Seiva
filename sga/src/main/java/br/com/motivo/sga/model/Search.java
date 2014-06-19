/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class Search implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idsearch")
	private Integer id;

	private String name;

	private String info;

	private Integer type;

	private Date datecreate;

	private User user;

}
