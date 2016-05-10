package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractFinancingcase entity provides the base persistence definition of the
 * Financingcase entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractFinancingcase implements java.io.Serializable {

	// Fields

	private Integer financingCaseId;
	private Project project;
	private String url;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractFinancingcase() {
	}

	/** minimal constructor */
	public AbstractFinancingcase(Integer financingCaseId, Project project) {
		this.financingCaseId = financingCaseId;
		this.project = project;
	}

	/** full constructor */
	public AbstractFinancingcase(Integer financingCaseId, Project project,
			String url, String content) {
		this.financingCaseId = financingCaseId;
		this.project = project;
		this.url = url;
		this.content = content;
	}

	// Property accessors
	@Id
	@Column(name = "financing_case_id", unique = true, nullable = false)
	public Integer getFinancingCaseId() {
		return this.financingCaseId;
	}

	public void setFinancingCaseId(Integer financingCaseId) {
		this.financingCaseId = financingCaseId;
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

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}