package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractInvestmentrecord entity provides the base persistence definition of
 * the Investmentrecord entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractInvestmentrecord implements java.io.Serializable {

	// Fields

	private Integer investId;
	private Users users;
	private Project project;
	private Integer statusId;
	private Integer projectId;
	private Float investAmount;
	private Timestamp investDate;

	// Constructors

	/** default constructor */
	public AbstractInvestmentrecord() {
	}

	/** minimal constructor */
	public AbstractInvestmentrecord(Integer investId, Project project,
			Timestamp investDate) {
		this.investId = investId;
		this.project = project;
		this.investDate = investDate;
	}

	/** full constructor */
	public AbstractInvestmentrecord(Integer investId, Users users,
			Project project, Integer statusId, Integer projectId,
			Float investAmount, Timestamp investDate) {
		this.investId = investId;
		this.users = users;
		this.project = project;
		this.statusId = statusId;
		this.projectId = projectId;
		this.investAmount = investAmount;
		this.investDate = investDate;
	}

	// Property accessors
	@Id
	@Column(name = "invest_id", unique = true, nullable = false)
	public Integer getInvestId() {
		return this.investId;
	}

	public void setInvestId(Integer investId) {
		this.investId = investId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "status_id")
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "project_id")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "invest_amount", precision = 12, scale = 0)
	public Float getInvestAmount() {
		return this.investAmount;
	}

	public void setInvestAmount(Float investAmount) {
		this.investAmount = investAmount;
	}

	@Column(name = "invest_date", nullable = false, length = 0)
	public Timestamp getInvestDate() {
		return this.investDate;
	}

	public void setInvestDate(Timestamp investDate) {
		this.investDate = investDate;
	}

}