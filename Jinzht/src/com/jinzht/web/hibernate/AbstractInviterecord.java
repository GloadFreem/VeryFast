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
 * AbstractInviterecord entity provides the base persistence definition of the
 * Inviterecord entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractInviterecord implements java.io.Serializable {

	// Fields

	private Integer inviteId;
	private Users users;
	private Systemcode systemcode;
	private Date inviteDate;

	// Constructors

	/** default constructor */
	public AbstractInviterecord() {
	}

	/** minimal constructor */
	public AbstractInviterecord(Integer inviteId) {
		this.inviteId = inviteId;
	}

	/** full constructor */
	public AbstractInviterecord(Integer inviteId, Users users,
			Systemcode systemcode, Date inviteDate) {
		this.inviteId = inviteId;
		this.users = users;
		this.systemcode = systemcode;
		this.inviteDate = inviteDate;
	}

	// Property accessors
	@Id
	@Column(name = "invite_id", unique = true, nullable = false)
	public Integer getInviteId() {
		return this.inviteId;
	}

	public void setInviteId(Integer inviteId) {
		this.inviteId = inviteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "code_id")
	public Systemcode getSystemcode() {
		return this.systemcode;
	}

	public void setSystemcode(Systemcode systemcode) {
		this.systemcode = systemcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "invite_date", length = 0)
	public Date getInviteDate() {
		return this.inviteDate;
	}

	public void setInviteDate(Date inviteDate) {
		this.inviteDate = inviteDate;
	}

}