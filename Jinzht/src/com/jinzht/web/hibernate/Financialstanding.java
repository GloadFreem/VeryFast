package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Financialstanding entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "financialstanding", catalog = "jinzht")
public class Financialstanding extends AbstractFinancialstanding implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Financialstanding() {
	}

	/** minimal constructor */
	public Financialstanding(Integer financeId, Project project) {
		super(financeId, project);
	}

	/** full constructor */
	public Financialstanding(Integer financeId, Project project,
			Integer projectId, String url, String content) {
		super(financeId, project, projectId, url, content);
	}

}
