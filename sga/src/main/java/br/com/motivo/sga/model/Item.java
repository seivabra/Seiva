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
public class Item implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "iditem")
	private Integer id;

	private String inventoryid;
	private String uritype;
	private String uri;
	private String physicalDescription;
	private String keywords;
	private String description;
	private String uidtype;
	private String uid;
	private String clazz;
	private String type;
	// TODO checar tipo bit
	private Boolean iseletronic;
	private String creationdate;
	private String acquisitiondate;
	private String scopecontent;
	private Boolean originalexistence;
	private String originallocation;
	private String repositorycode;
	private Boolean copyexistence;
	private String copylocation;
	private String legalaccess;
	private String accesscondition;
	private String reproductionrights;
	private String reproductionrightsdescription;
	// TODO CHECAR TIPO DATA
	private Date itemdate;
	private Date publishdate;
	private String publisher;
	private String itemdescription;
	private String itematributes;
	private String itemdimension;
	// TODO CHECAR BOOLEAN NOME
	private Boolean ispublic;
	private String preliminaryrule;
	private String punctuation;
	private String notes;
	private String otherinformation;

	private String titledefault;

	// deletecomfirm BIT(1) NULL DEFAULT NULL,
	// typeitem TINYINT(4) NULL DEFAULT NULL,
	// edition VARCHAR(250) NULL DEFAULT NULL,
	// isexposed BIT(1) NULL DEFAULT NULL,
	// isoriginal BIT(1) NULL DEFAULT NULL,
	// ispart BIT(1) NULL DEFAULT NULL,
	// haspart BIT(1) NULL DEFAULT NULL,
	// ispartof VARCHAR(45) NULL DEFAULT NULL,
	// numberofcopies INT(11) NULL DEFAULT NULL,
	// tobepublicin DATE NULL DEFAULT NULL,
	// creationdateattributed BIT(1) NULL DEFAULT NULL,
	// itemdateattributed BIT(1) NULL DEFAULT NULL,
	// publishdateattributed BIT(1) NULL DEFAULT NULL,
	// inscription TEXT NULL DEFAULT NULL,
	// serachdump TEXT NULL,

	// TODO CHECAR ESQUEMA DE ARVORE
	private Item idfather;
	// subitem TINYINT(4) NULL DEFAULT NULL,

	private Holder holder;
	private Level level;
	private Institution institution;

}
