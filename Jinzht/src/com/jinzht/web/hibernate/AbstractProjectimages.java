package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractProjectimages entity provides the base persistence definition of the
 * Projectimages entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractProjectimages implements java.io.Serializable {

	// Fields

	private Integer projectImageId;
	private Project project;
	private String imageUrl;

	// Constructors

	/** default constructor */
	public AbstractProjectimages() {
	}

	/** minimal constructor */
	public AbstractProjectimages(Integer projectImageId) {
		this.projectImageId = projectImageId;
	}

	/** full constructor */
	public AbstractProjectimages(Integer projectImageId, Project project,
			String imageUrl) {
		this.projectImageId = projectImageId;
		this.project = project;
		this.imageUrl = imageUrl;
	}

	// Property accessors
	@Id
	@Column(name = "project_image_id", unique = true, nullable = false)
	public Integer getProjectImageId() {
		return this.projectImageId;
	}

	public void setProjectImageId(Integer projectImageId) {
		this.projectImageId = projectImageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "image_url")
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}