package com.insat.wafa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.insat.wafa.entities.enumeration.Situation;
@Entity
public class AssuranceEmploye extends AssuranceUser{
	
	
	private Date date;
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;
	@ManyToOne
	@JoinColumn(name="idSociete")
	private Societe societe;

	@OneToMany(mappedBy="assuranceEmployes")
	private List<CareBulletin> careBulletins;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AssuranceEmploye(Long cin, Long registrationNumber, String name, String firstName, Situation familySituation,
			String spouceName, String address, Date subscriptionDate, String email, String cnamSector,
			String cnamAffiliation, String urlAffiliationFile, Date birthday, String password, float salary,
			boolean active, Date date) {
		super(cin, registrationNumber, name, firstName, familySituation, spouceName, address, subscriptionDate, email,
				cnamSector, cnamAffiliation, urlAffiliationFile, birthday, password, salary, active);
		this.date = date;
	}

	public AssuranceEmploye() {
		// TODO Auto-generated constructor stub
	}

	public AssuranceEmploye(Long cin, Long registrationNumber, String name, String firstName, Situation familySituation,
			String spouceName, String address, Date subscriptionDate, String email, String cnamSector,
			String cnamAffiliation, String urlAffiliationFile, Date birthday, String password, float salary,
			boolean active) {
		super(cin, registrationNumber, name, firstName, familySituation, spouceName, address, subscriptionDate, email,
				cnamSector, cnamAffiliation, urlAffiliationFile, birthday, password, salary, active);
		// TODO Auto-generated constructor stub
	}
	

}

