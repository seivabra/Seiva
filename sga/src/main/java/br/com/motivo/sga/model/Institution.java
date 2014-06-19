/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class Institution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idinstitution")
	Integer id;

	private String name;

	private String description;

	private String uri;

	private String otherinformation;

	private String cod;

	private Integer timezone;

	private Blob thumbnail;

}
