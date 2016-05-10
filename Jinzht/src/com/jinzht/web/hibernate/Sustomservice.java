package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Sustomservice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sustomservice", catalog = "jinzht")
public class Sustomservice extends AbstractSustomservice implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sustomservice() {
	}

	/** minimal constructor */
	public Sustomservice(Integer customServiceId) {
		super(customServiceId);
	}

	/** full constructor */
	public Sustomservice(Integer customServiceId, String name) {
		super(customServiceId, name);
	}

}
