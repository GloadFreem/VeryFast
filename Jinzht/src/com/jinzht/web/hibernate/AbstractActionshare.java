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
 * AbstractActionshare entity provides the base persistence definition of the
 * Actionshare entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractActionshare implements java.io.Serializable {

	// Fields

	private Integer shareId;
	private Action action;
	private Users users;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractActionshare() {
	}

	/** minimal constructor */
	public AbstractActionshare(Integer shareId, Users users) {
		this.shareId = shareId;
		this.users = users;
	}

	/** full constructor */
	public AbstractActionshare(Integer shareId, Action action, Users users,
			String content) {
		this.shareId = shareId;
		this.action = action;
		this.users = users;
		this.content = content;
	}

	// Property accessors
	@Id
	@Column(name = "share_id", unique = true, nullable = false)
	public Integer getShareId() {
		return this.shareId;
	}

	public void setShareId(Integer shareId) {
		this.shareId = shareId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "action_id")
	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "content", length = 256)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}