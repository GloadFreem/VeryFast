package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Systemuser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "systemuser", catalog = "jinzht")
public class Systemuser extends AbstractSystemuser implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Systemuser() {
	}

	/** minimal constructor */
	public Systemuser(Integer userId) {
		super(userId);
	}

	/** full constructor */
	public Systemuser(Integer userId, Roletype roletype, Boolean password) {
		super(userId, roletype, password);
	}

}
