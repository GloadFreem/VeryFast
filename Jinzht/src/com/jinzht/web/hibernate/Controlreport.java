package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Controlreport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "controlreport", catalog = "jinzht")
public class Controlreport extends AbstractControlreport implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Controlreport() {
	}

	/** minimal constructor */
	public Controlreport(Integer reportId, Project project) {
		super(reportId, project);
	}

	/** full constructor */
	public Controlreport(Integer reportId, Project project, String url,
			String content, Integer projectId) {
		super(reportId, project, url, content, projectId);
	}

}
