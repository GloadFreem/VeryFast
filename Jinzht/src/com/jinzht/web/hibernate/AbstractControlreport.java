package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractControlreport entity provides the base persistence definition of the
 * Controlreport entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractControlreport implements java.io.Serializable {

	// Fields

	private Integer reportId;
	private Project project;
	private String url;
	private String content;
	private Integer projectId;

	// Constructors

	/** default constructor */
	public AbstractControlreport() {
	}

	/** minimal constructor */
	public AbstractControlreport(Integer reportId, Project project) {
		this.reportId = reportId;
		this.project = project;
	}

	/** full constructor */
	public AbstractControlreport(Integer reportId, Project project, String url,
			String content, Integer projectId) {
		this.reportId = reportId;
		this.project = project;
		this.url = url;
		this.content = content;
		this.projectId = projectId;
	}

	// Property accessors
	@Id
	@Column(name = "report_id", unique = true, nullable = false)
	public Integer getReportId() {
		return this.reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
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

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

}