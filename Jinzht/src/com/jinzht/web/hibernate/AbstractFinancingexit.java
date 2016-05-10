package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractFinancingexit entity provides the base persistence definition of the
 * Financingexit entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractFinancingexit implements java.io.Serializable {

	// Fields

	private Integer financingExitId;
	private Project project;
	private String url;
	private Integer projectId;
	private String context;

	// Constructors

	/** default constructor */
	public AbstractFinancingexit() {
	}

	/** minimal constructor */
	public AbstractFinancingexit(Integer financingExitId, Project project) {
		this.financingExitId = financingExitId;
		this.project = project;
	}

	/** full constructor */
	public AbstractFinancingexit(Integer financingExitId, Project project,
			String url, Integer projectId, String context) {
		this.financingExitId = financingExitId;
		this.project = project;
		this.url = url;
		this.projectId = projectId;
		this.context = context;
	}

	// Property accessors
	@Id
	@Column(name = "financing_exit_id", unique = true, nullable = false)
	public Integer getFinancingExitId() {
		return this.financingExitId;
	}

	public void setFinancingExitId(Integer financingExitId) {
		this.financingExitId = financingExitId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "url", length = 100)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "context")
	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}