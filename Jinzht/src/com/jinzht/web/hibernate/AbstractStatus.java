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
 * AbstractStatus entity provides the base persistence definition of the Status
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractStatus implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private String name;
	private Set<Projectcommitrecord> projectcommitrecords = new HashSet<Projectcommitrecord>(
			0);

	// Constructors

	/** default constructor */
	public AbstractStatus() {
	}

	/** minimal constructor */
	public AbstractStatus(Integer recordId) {
		this.recordId = recordId;
	}

	/** full constructor */
	public AbstractStatus(Integer recordId, String name,
			Set<Projectcommitrecord> projectcommitrecords) {
		this.recordId = recordId;
		this.name = name;
		this.projectcommitrecords = projectcommitrecords;
	}

	// Property accessors
	@Id
	@Column(name = "record_id", unique = true, nullable = false)
	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "status")
	public Set<Projectcommitrecord> getProjectcommitrecords() {
		return this.projectcommitrecords;
	}

	public void setProjectcommitrecords(
			Set<Projectcommitrecord> projectcommitrecords) {
		this.projectcommitrecords = projectcommitrecords;
	}

}