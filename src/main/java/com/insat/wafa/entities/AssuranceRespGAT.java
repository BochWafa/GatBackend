package com.insat.wafa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.insat.wafa.entities.enumeration.Situation;
@Entity
public class AssuranceRespGAT extends AssuranceUser {
	@ManyToOne
	@JoinColumn(name="idRole")
	private Role role;
	public AssuranceRespGAT() {
		// TODO Auto-generated constructor stub
	}

	public AssuranceRespGAT(Long cin, Long registrationNumber, String name, String firstName, Situation familySituation,
			String spouceName, String address, Date subscriptionDate, String email, String cnamSector,
			String cnamAffiliation, String urlAffiliationFile, Date birthday, String password, float salary,
			boolean active) {
		super(cin, registrationNumber, name, firstName, familySituation, spouceName, address, subscriptionDate, email,
				cnamSector, cnamAffiliation, urlAffiliationFile, birthday, password, salary, active);
		// TODO Auto-generated constructor stub
	}

}
