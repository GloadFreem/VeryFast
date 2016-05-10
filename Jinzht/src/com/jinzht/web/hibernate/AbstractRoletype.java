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
 * AbstractRoletype entity provides the base persistence definition of the
 * Roletype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractRoletype implements java.io.Serializable {

	// Fields

	private Integer roleTypeId;
	private String name;
	private Set<Systemuser> systemusers = new HashSet<Systemuser>(0);

	// Constructors

	/** default constructor */
	public AbstractRoletype() {
	}

	/** minimal constructor */
	public AbstractRoletype(Integer roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	/** full constructor */
	public AbstractRoletype(Integer roleTypeId, String name,
			Set<Systemuser> systemusers) {
		this.roleTypeId = roleTypeId;
		this.name = name;
		this.systemusers = systemusers;
	}

	// Property accessors
	@Id
	@Column(name = "role_type_id", unique = true, nullable = false)
	public Integer getRoleTypeId() {
		return this.roleTypeId;
	}

	public void setRoleTypeId(Integer roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "roletype")
	public Set<Systemuser> getSystemusers() {
		return this.systemusers;
	}

	public void setSystemusers(Set<Systemuser> systemusers) {
		this.systemusers = systemusers;
	}

}