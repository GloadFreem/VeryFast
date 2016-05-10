package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Financestatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "financestatus", catalog = "jinzht")
public class Financestatus extends AbstractFinancestatus implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Financestatus() {
	}

	/** minimal constructor */
	public Financestatus(Integer statusId) {
		super(statusId);
	}

	/** full constructor */
	public Financestatus(Integer statusId, String name, Short isvalid,
			Set<Project> projects) {
		super(statusId, name, isvalid, projects);
	}

}
