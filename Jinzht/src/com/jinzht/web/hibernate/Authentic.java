package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Authentic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "authentic", catalog = "jinzht")
public class Authentic extends AbstractAuthentic implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Authentic() {
	}

	/** minimal constructor */
	public Authentic(Integer authId, String name, String identiyCarA,
			String identiyCarB, String identiyCarNo) {
		super(authId, name, identiyCarA, identiyCarB, identiyCarNo);
	}

	/** full constructor */
	public Authentic(Integer authId, Industoryarea industoryarea, Users users,
			Identiytype identiytype, Industorytype industorytype, String name,
			String identiyCarA, String identiyCarB, String identiyCarNo,
			String companyName, String companyAddress, String position,
			String buinessLicence, String buinessLicenceNo, String introduce,
			String companyIntroduce, Short optional, Autrhrecord autrhrecord) {
		super(authId, industoryarea, users, identiytype, industorytype, name,
				identiyCarA, identiyCarB, identiyCarNo, companyName,
				companyAddress, position, buinessLicence, buinessLicenceNo,
				introduce, companyIntroduce, optional, autrhrecord);
	}

}
