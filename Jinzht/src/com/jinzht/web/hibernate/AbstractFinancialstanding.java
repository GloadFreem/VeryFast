package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractFinancialstanding entity provides the base persistence definition of
 * the Financialstanding entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractFinancialstanding implements java.io.Serializable {

	// Fields

	private Integer financeId;
	private Project project;
	private Integer projectId;
	private String url;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractFinancialstanding() {
	}

	/** minimal constructor */
	public AbstractFinancialstanding(Integer financeId, Project project) {
		this.financeId = financeId;
		this.project = project;
	}

	/** full constructor */
	public AbstractFinancialstanding(Integer financeId, Project project,
			Integer projectId, String url, String content) {
		this.financeId = financeId;
		this.project = project;
		this.projectId = projectId;
		this.url = url;
		this.content = content;
	}

	// Property accessors
	@Id
	@Column(name = "finance_id", unique = true, nullable = false)
	public Integer getFinanceId() {
		return this.financeId;
	}

	public void setFinanceId(Integer financeId) {
		this.financeId = financeId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "url")
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