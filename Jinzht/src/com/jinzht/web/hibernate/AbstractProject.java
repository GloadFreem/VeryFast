package com.jinzht.web.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * AbstractProject entity provides the base persistence definition of the
 * Project entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractProject implements java.io.Serializable {

	// Fields

	private Integer projectId;
	private Financestatus financestatus;
	private String abbrevName;
	private String fullName;
	private String description;
	private Short projectType;
	private String address;
	private String startPageImage;
	private Scene scene;
	private Set<Communion> communions = new HashSet<Communion>(0);
	private Set<Projectcomment> projectcomments = new HashSet<Projectcomment>(0);
	private Controlreport controlreport;
	private Financingexit financingexit;
	private Financialstanding financialstanding;
	private Collection collection;
	private Financingcase financingcase;
	private Investmentrecord investmentrecord;
	private Set<Projectcommitrecord> projectcommitrecords = new HashSet<Projectcommitrecord>(
			0);
	private Set<Team> teams = new HashSet<Team>(0);
	private Businessplan businessplan;
	private Set<Member> members = new HashSet<Member>(0);
	private Set<Roadshow> roadshows = new HashSet<Roadshow>(0);
	private Set<Projectimages> projectimageses = new HashSet<Projectimages>(0);

	// Constructors

	/** default constructor */
	public AbstractProject() {
	}

	/** minimal constructor */
	public AbstractProject(Integer projectId) {
		this.projectId = projectId;
	}

	/** full constructor */
	public AbstractProject(Integer projectId, Financestatus financestatus,
			String abbrevName, String fullName, String description,
			Short projectType, String address, String startPageImage,
			Scene scene, Set<Communion> communions,
			Set<Projectcomment> projectcomments, Controlreport controlreport,
			Financingexit financingexit, Financialstanding financialstanding,
			Collection collection, Financingcase financingcase,
			Investmentrecord investmentrecord,
			Set<Projectcommitrecord> projectcommitrecords, Set<Team> teams,
			Businessplan businessplan, Set<Member> members,
			Set<Roadshow> roadshows, Set<Projectimages> projectimageses) {
		this.projectId = projectId;
		this.financestatus = financestatus;
		this.abbrevName = abbrevName;
		this.fullName = fullName;
		this.description = description;
		this.projectType = projectType;
		this.address = address;
		this.startPageImage = startPageImage;
		this.scene = scene;
		this.communions = communions;
		this.projectcomments = projectcomments;
		this.controlreport = controlreport;
		this.financingexit = financingexit;
		this.financialstanding = financialstanding;
		this.collection = collection;
		this.financingcase = financingcase;
		this.investmentrecord = investmentrecord;
		this.projectcommitrecords = projectcommitrecords;
		this.teams = teams;
		this.businessplan = businessplan;
		this.members = members;
		this.roadshows = roadshows;
		this.projectimageses = projectimageses;
	}

	// Property accessors
	@Id
	@Column(name = "project_id", unique = true, nullable = false)
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id")
	public Financestatus getFinancestatus() {
		return this.financestatus;
	}

	public void setFinancestatus(Financestatus financestatus) {
		this.financestatus = financestatus;
	}

	@Column(name = "abbrev_name")
	public String getAbbrevName() {
		return this.abbrevName;
	}

	public void setAbbrevName(String abbrevName) {
		this.abbrevName = abbrevName;
	}

	@Column(name = "full_name")
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "project_type")
	public Short getProjectType() {
		return this.projectType;
	}

	public void setProjectType(Short projectType) {
		this.projectType = projectType;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "start_page_image", length = 200)
	public String getStartPageImage() {
		return this.startPageImage;
	}

	public void setStartPageImage(String startPageImage) {
		this.startPageImage = startPageImage;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Communion> getCommunions() {
		return this.communions;
	}

	public void setCommunions(Set<Communion> communions) {
		this.communions = communions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Projectcomment> getProjectcomments() {
		return this.projectcomments;
	}

	public void setProjectcomments(Set<Projectcomment> projectcomments) {
		this.projectcomments = projectcomments;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Controlreport getControlreport() {
		return this.controlreport;
	}

	public void setControlreport(Controlreport controlreport) {
		this.controlreport = controlreport;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Financingexit getFinancingexit() {
		return this.financingexit;
	}

	public void setFinancingexit(Financingexit financingexit) {
		this.financingexit = financingexit;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Financialstanding getFinancialstanding() {
		return this.financialstanding;
	}

	public void setFinancialstanding(Financialstanding financialstanding) {
		this.financialstanding = financialstanding;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Collection getCollection() {
		return this.collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Financingcase getFinancingcase() {
		return this.financingcase;
	}

	public void setFinancingcase(Financingcase financingcase) {
		this.financingcase = financingcase;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Investmentrecord getInvestmentrecord() {
		return this.investmentrecord;
	}

	public void setInvestmentrecord(Investmentrecord investmentrecord) {
		this.investmentrecord = investmentrecord;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Projectcommitrecord> getProjectcommitrecords() {
		return this.projectcommitrecords;
	}

	public void setProjectcommitrecords(
			Set<Projectcommitrecord> projectcommitrecords) {
		this.projectcommitrecords = projectcommitrecords;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Team> getTeams() {
		return this.teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "project")
	public Businessplan getBusinessplan() {
		return this.businessplan;
	}

	public void setBusinessplan(Businessplan businessplan) {
		this.businessplan = businessplan;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Member> getMembers() {
		return this.members;
	}

	public void setMembers(Set<Member> members) {
		this.members = members;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Roadshow> getRoadshows() {
		return this.roadshows;
	}

	public void setRoadshows(Set<Roadshow> roadshows) {
		this.roadshows = roadshows;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "project")
	public Set<Projectimages> getProjectimageses() {
		return this.projectimageses;
	}

	public void setProjectimageses(Set<Projectimages> projectimageses) {
		this.projectimageses = projectimageses;
	}

}