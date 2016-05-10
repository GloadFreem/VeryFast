package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractProjectcomment entity provides the base persistence definition of the
 * Projectcomment entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractProjectcomment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Project project;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractProjectcomment() {
	}

	/** minimal constructor */
	public AbstractProjectcomment(Integer commentId) {
		this.commentId = commentId;
	}

	/** full constructor */
	public AbstractProjectcomment(Integer commentId, Project project,
			String content) {
		this.commentId = commentId;
		this.project = project;
		this.content = content;
	}

	// Property accessors
	@Id
	@Column(name = "comment_id", unique = true, nullable = false)
	public Integer getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
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

}