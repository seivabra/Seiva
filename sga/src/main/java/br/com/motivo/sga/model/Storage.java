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
public class Storage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idstorage")
	private Integer id;

	private String host;

	private String local;

	private String username;

	private String password;

	private String folder;

	private String urlftp;

	private String urlhttp;

	private String ipaddress;

	private Boolean full;

	private Long usedspace;

	private Long diskcapacity;

	private Boolean defaultstorage;

	private Integer port;

	private String status;

	private Institution institution;

}
