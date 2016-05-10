package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Status entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "status", catalog = "jinzht")
public class Status extends AbstractStatus implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Status() {
	}

	/** minimal constructor */
	public Status(Integer recordId) {
		super(recordId);
	}

	/** full constructor */
	public Status(Integer recordId, String name,
			Set<Projectcommitrecord> projectcommitrecords) {
		super(recordId, name, projectcommitrecords);
	}

}
