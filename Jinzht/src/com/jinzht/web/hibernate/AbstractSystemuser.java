package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractSystemuser entity provides the base persistence definition of the
 * Systemuser entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractSystemuser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Roletype roletype;
	private Boolean password;

	// Constructors

	/** default constructor */
	public AbstractSystemuser() {
	}

	/** minimal constructor */
	public AbstractSystemuser(Integer userId) {
		this.userId = userId;
	}

	/** full constructor */
	public AbstractSystemuser(Integer userId, Roletype roletype,
			Boolean password) {
		this.userId = userId;
		this.roletype = roletype;
		this.password = password;
	}

	// Property accessors
	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_type_id")
	public Roletype getRoletype() {
		return this.roletype;
	}

	public void setRoletype(Roletype roletype) {
		this.roletype = roletype;
	}

	@Column(name = "password")
	public Boolean getPassword() {
		return this.password;
	}

	public void setPassword(Boolean password) {
		this.password = password;
	}

}