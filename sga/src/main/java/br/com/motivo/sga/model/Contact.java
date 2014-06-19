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
public class Contact implements Serializable {

	@Id
	@Column(name = "idcontact")
	private Integer id;

	private String contactname;
	
	private String url;
	
	private String contactcall;
	
	private String company;
	
	private String uri;
	
	private String identity;
	
	private String federaltaxcode;
	
	private String statetaxcode;
	
	private String countytaxcode;

	private Institution institution;
	
	private Item item;
	
	private ExpoItem expoItem;
	
	private Holder holder;
	
	private Creator creator;
	
	private User user;

}
