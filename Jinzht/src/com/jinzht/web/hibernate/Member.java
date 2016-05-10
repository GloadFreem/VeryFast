package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "member", catalog = "jinzht")
public class Member extends AbstractMember implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** minimal constructor */
	public Member(Integer memberId) {
		super(memberId);
	}

	/** full constructor */
	public Member(Integer memberId, Project project, String name,
			String company, String position, String address, String industory,
			String emial) {
		super(memberId, project, name, company, position, address, industory,
				emial);
	}

}
