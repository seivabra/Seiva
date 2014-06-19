/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ferrete
 * 
 */
@Entity
public class Media implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idmedia")
	private Integer id;

	private String mediatype;

	private String mediaurl;

	private Date digitizationdate;

	private String digitizationresponsable;

	private String polarity;

	private String colorspace;

	private String iccprofile;

	private String xresolution;

	private String yresolution;

	private Blob thumbnail;

	private String digitizationequipment;

	private String format;

	private Boolean ispublic;

	private String ordername;

	private Boolean sent;

	private String exif;

	private String textual;

	private Long sizemedia;

	private String nameoriginal;

	private Boolean mainmedia;

	private Item item;

	private History history;

	private Storage storage;

	private Documentation documentation;

	private Institution institution;

	private Reference reference;

}
