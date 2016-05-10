package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractTeam entity provides the base persistence definition of the Team
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractTeam implements java.io.Serializable {

	// Fields

	private Integer personId;
	private Project project;
	private String name;
	private String icon;
	private String position;
	private String company;
	private String address;
	private String introduce;
	private String url;

	// Constructors

	/** default constructor */
	public AbstractTeam() {
	}

	/** minimal constructor */
	public AbstractTeam(Integer personId) {
		this.personId = personId;
	}

	/** full constructor */
	public AbstractTeam(Integer personId, Project project, String name,
			String icon, String position, String company, String address,
			String introduce, String url) {
		this.personId = personId;
		this.project = project;
		this.name = name;
		this.icon = icon;
		this.position = position;
		this.company = company;
		this.address = address;
		this.introduce = introduce;
		this.url = url;
	}

	// Property accessors
	@Id
	@Column(name = "person_id", unique = true, nullable = false)
	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
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

	@Column(name = "icon", length = 200)
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "position", length = 100)
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name = "company", length = 100)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "introduce")
	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Column(name = "url", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}