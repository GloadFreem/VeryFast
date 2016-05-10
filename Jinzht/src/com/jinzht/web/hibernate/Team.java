package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Team entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "team", catalog = "jinzht")
public class Team extends AbstractTeam implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Team() {
	}

	/** minimal constructor */
	public Team(Integer personId) {
		super(personId);
	}

	/** full constructor */
	public Team(Integer personId, Project project, String name, String icon,
			String position, String company, String address, String introduce,
			String url) {
		super(personId, project, name, icon, position, company, address,
				introduce, url);
	}

}
