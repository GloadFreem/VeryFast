package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Investmentrecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "investmentrecord", catalog = "jinzht")
public class Investmentrecord extends AbstractInvestmentrecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Investmentrecord() {
	}

	/** minimal constructor */
	public Investmentrecord(Integer investId, Project project,
			Timestamp investDate) {
		super(investId, project, investDate);
	}

	/** full constructor */
	public Investmentrecord(Integer investId, Users users, Project project,
			Integer statusId, Integer projectId, Float investAmount,
			Timestamp investDate) {
		super(investId, users, project, statusId, projectId, investAmount,
				investDate);
	}

}
