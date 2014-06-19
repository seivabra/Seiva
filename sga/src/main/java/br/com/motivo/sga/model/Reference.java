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
public class Reference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idreference")
	private Integer id;

	private String referencetype;

	private String referencetitle;

	private String referencedescription;

	private String referenceauthor;

	private String referencetext;

	private String otherinformations;

	private Boolean isPublic;

	private Item item;

	private Institution institution;

	private Creator creator;

}
