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
 * AbstractFinancestatus entity provides the base persistence definition of the
 * Financestatus entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractFinancestatus implements java.io.Serializable {

	// Fields

	private Integer statusId;
	private String name;
	private Short isvalid;
	private Set<Project> projects = new HashSet<Project>(0);

	// Constructors

	/** default constructor */
	public AbstractFinancestatus() {
	}

	/** minimal constructor */
	public AbstractFinancestatus(Integer statusId) {
		this.statusId = statusId;
	}

	/** full constructor */
	public AbstractFinancestatus(Integer statusId, String name, Short isvalid,
			Set<Project> projects) {
		this.statusId = statusId;
		this.name = name;
		this.isvalid = isvalid;
		this.projects = projects;
	}

	// Property accessors
	@Id
	@Column(name = "status_id", unique = true, nullable = false)
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "isvalid")
	public Short getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Short isvalid) {
		this.isvalid = isvalid;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "financestatus")
	public Set<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}