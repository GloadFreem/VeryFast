package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Userstatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "userstatus", catalog = "jinzht")
public class Userstatus extends AbstractUserstatus implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Userstatus() {
	}

	/** minimal constructor */
	public Userstatus(Integer userStatusId, String name) {
		super(userStatusId, name);
	}

	/** full constructor */
	public Userstatus(Integer userStatusId, String name, Set<Users> userses) {
		super(userStatusId, name, userses);
	}

}
