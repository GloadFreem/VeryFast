package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractActioncomment entity provides the base persistence definition of the
 * Actioncomment entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractActioncomment implements java.io.Serializable {

	// Fields

	private Integer commentId;
	private Users users;
	private Action action;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractActioncomment() {
	}

	/** minimal constructor */
	public AbstractActioncomment(Integer commentId) {
		this.commentId = commentId;
	}

	/** full constructor */
	public AbstractActioncomment(Integer commentId, Users users, Action action,
			String content) {
		this.commentId = commentId;
		this.users = users;
		this.action = action;
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
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "action_id")
	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}