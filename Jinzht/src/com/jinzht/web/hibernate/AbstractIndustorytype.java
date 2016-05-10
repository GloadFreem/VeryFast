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
 * AbstractIndustorytype entity provides the base persistence definition of the
 * Industorytype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractIndustorytype implements java.io.Serializable {

	// Fields

	private Integer industoryId;
	private String name;
	private Set<Authentic> authentics = new HashSet<Authentic>(0);

	// Constructors

	/** default constructor */
	public AbstractIndustorytype() {
	}

	/** minimal constructor */
	public AbstractIndustorytype(Integer industoryId) {
		this.industoryId = industoryId;
	}

	/** full constructor */
	public AbstractIndustorytype(Integer industoryId, String name,
			Set<Authentic> authentics) {
		this.industoryId = industoryId;
		this.name = name;
		this.authentics = authentics;
	}

	// Property accessors
	@Id
	@Column(name = "industory_id", unique = true, nullable = false)
	public Integer getIndustoryId() {
		return this.industoryId;
	}

	public void setIndustoryId(Integer industoryId) {
		this.industoryId = industoryId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "industorytype")
	public Set<Authentic> getAuthentics() {
		return this.authentics;
	}

	public void setAuthentics(Set<Authentic> authentics) {
		this.authentics = authentics;
	}

}