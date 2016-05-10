package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Roletype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roletype", catalog = "jinzht")
public class Roletype extends AbstractRoletype implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Roletype() {
	}

	/** minimal constructor */
	public Roletype(Integer roleTypeId) {
		super(roleTypeId);
	}

	/** full constructor */
	public Roletype(Integer roleTypeId, String name, Set<Systemuser> systemusers) {
		super(roleTypeId, name, systemusers);
	}

}
