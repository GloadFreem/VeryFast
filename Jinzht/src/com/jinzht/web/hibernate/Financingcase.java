package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Financingcase entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "financingcase", catalog = "jinzht")
public class Financingcase extends AbstractFinancingcase implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Financingcase() {
	}

	/** minimal constructor */
	public Financingcase(Integer financingCaseId, Project project) {
		super(financingCaseId, project);
	}

	/** full constructor */
	public Financingcase(Integer financingCaseId, Project project, String url,
			String content) {
		super(financingCaseId, project, url, content);
	}

}
