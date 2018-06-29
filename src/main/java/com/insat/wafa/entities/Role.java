package com.insat.wafa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Role implements Serializable{
	@Id
	@GeneratedValue
	private Long idRole;
	private String poste;
	private Long plafond;
	
	@OneToMany(mappedBy="role")
	private List<AssuranceEmploye> assuranceEmployes;
	@OneToMany(mappedBy="role")
	private List<AssuranceRespGAT> assuranceRespgats;
	@OneToMany(mappedBy="role")
	private List<AssuranceRespSociete> assuranceRespSocietes;


	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long id) {
		this.idRole = id;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public Long getPlafond() {
		return plafond;
	}
	public void setPlafond(Long plafond) {
		this.plafond = plafond;
	}
	public Role(String poste, Long plafond) {
		super();
		this.poste = poste;
		this.plafond = plafond;
	}
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
