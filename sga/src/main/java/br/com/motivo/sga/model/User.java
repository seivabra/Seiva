/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "iduser")
	private Integer id;

	private Institution institution;

	private String fullname;

	private String username;

	private String password;

	private String notes;

	private String code;

	private Timezones timezones;

	private Timestamp lastlogin;

	private Integer status;

	private Boolean admin;

}
