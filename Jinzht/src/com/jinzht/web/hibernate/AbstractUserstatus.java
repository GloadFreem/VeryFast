package com.jinzht.web.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * AbstractUserstatus entity provides the base persistence definition of the
 * Userstatus entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractUserstatus implements java.io.Serializable {

	// Fields

	private Integer userStatusId;
	private String name;
	private Set<Users> userses = new HashSet<Users>(0);

	// Constructors

	/** default constructor */
	public AbstractUserstatus() {
	}

	/** minimal constructor */
	public AbstractUserstatus(Integer userStatusId, String name) {
		this.userStatusId = userStatusId;
		this.name = name;
	}

	/** full constructor */
	public AbstractUserstatus(Integer userStatusId, String name,
			Set<Users> userses) {
		this.userStatusId = userStatusId;
		this.name = name;
		this.userses = userses;
	}

	// Property accessors
	@Id
	@Column(name = "user_status_id", unique = true, nullable = false)
	public Integer getUserStatusId() {
		return this.userStatusId;
	}

	public void setUserStatusId(Integer userStatusId) {
		this.userStatusId = userStatusId;
	}

	@Column(name = "name", nullable = false, length = 11)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "userstatus")
	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

}