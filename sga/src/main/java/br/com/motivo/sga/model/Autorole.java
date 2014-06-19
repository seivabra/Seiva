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
public class Autorole implements Serializable {

	@Id
	@Column(name = "idautorole")
	private Integer id;

}
