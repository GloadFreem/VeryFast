package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AbstractLoginfailrecord entity provides the base persistence definition of
 * the Loginfailrecord entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractLoginfailrecord implements java.io.Serializable {

	// Fields

	private Integer failId;
	private Users users;
	private Short count;
	private Short platform;
	private Date loginFailDate;

	// Constructors

	/** default constructor */
	public AbstractLoginfailrecord() {
	}

	/** minimal constructor */
	public AbstractLoginfailrecord(Integer failId) {
		this.failId = failId;
	}

	/** full constructor */
	public AbstractLoginfailrecord(Integer failId, Users users, Short count,
			Short platform, Date loginFailDate) {
		this.failId = failId;
		this.users = users;
		this.count = count;
		this.platform = platform;
		this.loginFailDate = loginFailDate;
	}

	// Property accessors
	@Id
	@Column(name = "fail_id", unique = true, nullable = false)
	public Integer getFailId() {
		return this.failId;
	}

	public void setFailId(Integer failId) {
		this.failId = failId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "count")
	public Short getCount() {
		return this.count;
	}

	public void setCount(Short count) {
		this.count = count;
	}

	@Column(name = "platform")
	public Short getPlatform() {
		return this.platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "login_fail_date", length = 0)
	public Date getLoginFailDate() {
		return this.loginFailDate;
	}

	public void setLoginFailDate(Date loginFailDate) {
		this.loginFailDate = loginFailDate;
	}

}