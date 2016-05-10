package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractActionprise entity provides the base persistence definition of the
 * Actionprise entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractActionprise implements java.io.Serializable {

	// Fields

	private Integer priseId;
	private Users users;
	private Action action;

	// Constructors

	/** default constructor */
	public AbstractActionprise() {
	}

	/** minimal constructor */
	public AbstractActionprise(Integer priseId) {
		this.priseId = priseId;
	}

	/** full constructor */
	public AbstractActionprise(Integer priseId, Users users, Action action) {
		this.priseId = priseId;
		this.users = users;
		this.action = action;
	}

	// Property accessors
	@Id
	@Column(name = "prise_id", unique = true, nullable = false)
	public Integer getPriseId() {
		return this.priseId;
	}

	public void setPriseId(Integer priseId) {
		this.priseId = priseId;
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

}