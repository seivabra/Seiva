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
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idaddress")
	private Integer id;

	private String street;

	private String number;

	private String complement;

	private String zipcode;

	private String otherinformation;

	private City city;
	
	private Contact contact;
}
