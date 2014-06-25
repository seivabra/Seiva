/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author ferrete
 * 
 */
@Entity
//@Table(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idaddress")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String street;

	private String number;

	private String complement;

	private String zipcode;

	private String otherinformation;

//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idcity", nullable = false)
//	private City city;
//
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idcontact", nullable = false)
//	private Contact contact;
}
