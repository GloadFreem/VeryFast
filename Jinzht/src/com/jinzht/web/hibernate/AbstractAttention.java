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
 * AbstractAttention entity provides the base persistence definition of the
 * Attention entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractAttention implements java.io.Serializable {

	// Fields

	private Integer attendUid;
	private Action action;
	private Users users;
	private String content;
	private Timestamp enrollDate;

	// Constructors

	/** default constructor */
	public AbstractAttention() {
	}

	/** minimal constructor */
	public AbstractAttention(Integer attendUid, Action action) {
		this.attendUid = attendUid;
		this.action = action;
	}

	/** full constructor */
	public AbstractAttention(Integer attendUid, Action action, Users users,
			String content, Timestamp enrollDate) {
		this.attendUid = attendUid;
		this.action = action;
		this.users = users;
		this.content = content;
		this.enrollDate = enrollDate;
	}

	// Property accessors
	@Id
	@Column(name = "attend_uid", unique = true, nullable = false)
	public Integer getAttendUid() {
		return this.attendUid;
	}

	public void setAttendUid(Integer attendUid) {
		this.attendUid = attendUid;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Action getAction() {
		return this.action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "content", length = 256)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "enroll_date", length = 0)
	public Timestamp getEnrollDate() {
		return this.enrollDate;
	}

	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}

}