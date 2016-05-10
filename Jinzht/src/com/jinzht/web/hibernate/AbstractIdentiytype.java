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
 * AbstractIdentiytype entity provides the base persistence definition of the
 * Identiytype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractIdentiytype implements java.io.Serializable {

	// Fields

	private Long identiyTypeId;
	private String name;
	private Set<Authentic> authentics = new HashSet<Authentic>(0);

	// Constructors

	/** default constructor */
	public AbstractIdentiytype() {
	}

	/** minimal constructor */
	public AbstractIdentiytype(Long identiyTypeId) {
		this.identiyTypeId = identiyTypeId;
	}

	/** full constructor */
	public AbstractIdentiytype(Long identiyTypeId, String name,
			Set<Authentic> authentics) {
		this.identiyTypeId = identiyTypeId;
		this.name = name;
		this.authentics = authentics;
	}

	// Property accessors
	@Id
	@Column(name = "identiy_type_id", unique = true, nullable = false)
	public Long getIdentiyTypeId() {
		return this.identiyTypeId;
	}

	public void setIdentiyTypeId(Long identiyTypeId) {
		this.identiyTypeId = identiyTypeId;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "identiytype")
	public Set<Authentic> getAuthentics() {
		return this.authentics;
	}

	public void setAuthentics(Set<Authentic> authentics) {
		this.authentics = authentics;
	}

}