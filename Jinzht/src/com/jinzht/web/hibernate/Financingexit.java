package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Financingexit entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "financingexit", catalog = "jinzht")
public class Financingexit extends AbstractFinancingexit implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Financingexit() {
	}

	/** minimal constructor */
	public Financingexit(Integer financingExitId, Project project) {
		super(financingExitId, project);
	}

	/** full constructor */
	public Financingexit(Integer financingExitId, Project project, String url,
			Integer projectId, String context) {
		super(financingExitId, project, url, projectId, context);
	}

}
