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
 * AbstractIndustoryarea entity provides the base persistence definition of the
 * Industoryarea entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractIndustoryarea implements java.io.Serializable {

	// Fields

	private Integer areaId;
	private String name;
	private Boolean isvalid;
	private Set<Authentic> authentics = new HashSet<Authentic>(0);

	// Constructors

	/** default constructor */
	public AbstractIndustoryarea() {
	}

	/** minimal constructor */
	public AbstractIndustoryarea(Integer areaId) {
		this.areaId = areaId;
	}

	/** full constructor */
	public AbstractIndustoryarea(Integer areaId, String name, Boolean isvalid,
			Set<Authentic> authentics) {
		this.areaId = areaId;
		this.name = name;
		this.isvalid = isvalid;
		this.authentics = authentics;
	}

	// Property accessors
	@Id
	@Column(name = "area_id", unique = true, nullable = false)
	public Integer getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "isvalid")
	public Boolean getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "industoryarea")
	public Set<Authentic> getAuthentics() {
		return this.authentics;
	}

	public void setAuthentics(Set<Authentic> authentics) {
		this.authentics = authentics;
	}

}