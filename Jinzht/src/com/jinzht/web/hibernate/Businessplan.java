package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Businessplan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "businessplan", catalog = "jinzht")
public class Businessplan extends AbstractBusinessplan implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Businessplan() {
	}

	/** minimal constructor */
	public Businessplan(Integer buinessPlanId, Project project) {
		super(buinessPlanId, project);
	}

	/** full constructor */
	public Businessplan(Integer buinessPlanId, Project project, String url,
			String content) {
		super(buinessPlanId, project, url, content);
	}

}
