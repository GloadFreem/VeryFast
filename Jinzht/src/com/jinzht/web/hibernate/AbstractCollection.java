package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractCollection entity provides the base persistence definition of the
 * Collection entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractCollection implements java.io.Serializable {

	// Fields

	private Integer collectionId;
	private Users users;
	private Project project;
	private String projectId;

	// Constructors

	/** default constructor */
	public AbstractCollection() {
	}

	/** minimal constructor */
	public AbstractCollection(Integer collectionId, Project project) {
		this.collectionId = collectionId;
		this.project = project;
	}

	/** full constructor */
	public AbstractCollection(Integer collectionId, Users users,
			Project project, String projectId) {
		this.collectionId = collectionId;
		this.users = users;
		this.project = project;
		this.projectId = projectId;
	}

	// Property accessors
	@Id
	@Column(name = "collection_id", unique = true, nullable = false)
	public Integer getCollectionId() {
		return this.collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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
	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}