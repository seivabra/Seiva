/**
 * 
 */
package br.com.motivo.sga.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author ferrete
 * 
 */
@Entity
//@Table(name = "city")
public class City implements Serializable {

	@Id
	@Column(name = "idcity")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String city;

	private String citycode;

	private Boolean citypublic;

//	@OneToMany(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idstate", nullable = false)
//	private List<State> state;
//
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "idinstitution", nullable = true)
//	private Institution institution;

}
