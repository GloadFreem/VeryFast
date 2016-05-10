package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AbstractCommunion entity provides the base persistence definition of the
 * Communion entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractCommunion implements java.io.Serializable {

	// Fields

	private Integer interactionId;
	private Users users;
	private Project project;
	private String content;
	private Date interactionDate;

	// Constructors

	/** default constructor */
	public AbstractCommunion() {
	}

	/** minimal constructor */
	public AbstractCommunion(Integer interactionId) {
		this.interactionId = interactionId;
	}

	/** full constructor */
	public AbstractCommunion(Integer interactionId, Users users,
			Project project, String content, Date interactionDate) {
		this.interactionId = interactionId;
		this.users = users;
		this.project = project;
		this.content = content;
		this.interactionDate = interactionDate;
	}

	// Property accessors
	@Id
	@Column(name = "interaction_id", unique = true, nullable = false)
	public Integer getInteractionId() {
		return this.interactionId;
	}

	public void setInteractionId(Integer interactionId) {
		this.interactionId = interactionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "interaction_date", length = 0)
	public Date getInteractionDate() {
		return this.interactionDate;
	}

	public void setInteractionDate(Date interactionDate) {
		this.interactionDate = interactionDate;
	}

}