package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractMember entity provides the base persistence definition of the Member
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractMember implements java.io.Serializable {

	// Fields

	private Integer memberId;
	private Project project;
	private String name;
	private String company;
	private String position;
	private String address;
	private String industory;
	private String emial;

	// Constructors

	/** default constructor */
	public AbstractMember() {
	}

	/** minimal constructor */
	public AbstractMember(Integer memberId) {
		this.memberId = memberId;
	}

	/** full constructor */
	public AbstractMember(Integer memberId, Project project, String name,
			String company, String position, String address, String industory,
			String emial) {
		this.memberId = memberId;
		this.project = project;
		this.name = name;
		this.company = company;
		this.position = position;
		this.address = address;
		this.industory = industory;
		this.emial = emial;
	}

	// Property accessors
	@Id
	@Column(name = "member_id", unique = true, nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "company", length = 100)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "position", length = 100)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "industory", length = 100)
	public String getIndustory() {
		return this.industory;
	}

	public void setIndustory(String industory) {
		this.industory = industory;
	}

	@Column(name = "emial", length = 100)
	public String getEmial() {
		return this.emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

}