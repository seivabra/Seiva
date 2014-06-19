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
public class Level implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idlevel")
	private Integer id;

	private Integer seriefather;

	private Integer fond;

	private Integer type;

	private String level;

	private Integer countitem;

	private Institution institution;

}
