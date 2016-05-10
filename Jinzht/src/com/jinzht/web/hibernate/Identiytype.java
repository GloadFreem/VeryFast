package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Identiytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "identiytype", catalog = "jinzht")
public class Identiytype extends AbstractIdentiytype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Identiytype() {
	}

	/** minimal constructor */
	public Identiytype(Long identiyTypeId) {
		super(identiyTypeId);
	}

	/** full constructor */
	public Identiytype(Long identiyTypeId, String name,
			Set<Authentic> authentics) {
		super(identiyTypeId, name, authentics);
	}

}
