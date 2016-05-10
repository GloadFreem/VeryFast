package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractBusinessplan entity provides the base persistence definition of the
 * Businessplan entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractBusinessplan implements java.io.Serializable {

	// Fields

	private Integer buinessPlanId;
	private Project project;
	private String url;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractBusinessplan() {
	}

	/** minimal constructor */
	public AbstractBusinessplan(Integer buinessPlanId, Project project) {
		this.buinessPlanId = buinessPlanId;
		this.project = project;
	}

	/** full constructor */
	public AbstractBusinessplan(Integer buinessPlanId, Project project,
			String url, String content) {
		this.buinessPlanId = buinessPlanId;
		this.project = project;
		this.url = url;
		this.content = content;
	}

	// Property accessors
	@Id
	@Column(name = "buiness_plan_id", unique = true, nullable = false)
	public Integer getBuinessPlanId() {
		return this.buinessPlanId;
	}

	public void setBuinessPlanId(Integer buinessPlanId) {
		this.buinessPlanId = buinessPlanId;
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

	@Column(name = "content", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}