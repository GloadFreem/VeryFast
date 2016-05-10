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

/**
 * AbstractSystemcode entity provides the base persistence definition of the
 * Systemcode entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractSystemcode implements java.io.Serializable {

	// Fields

	private Integer codeId;
	private Users users;
	private String code;
	private Set<Inviterecord> inviterecords = new HashSet<Inviterecord>(0);

	// Constructors

	/** default constructor */
	public AbstractSystemcode() {
	}

	/** minimal constructor */
	public AbstractSystemcode(Integer codeId) {
		this.codeId = codeId;
	}

	/** full constructor */
	public AbstractSystemcode(Integer codeId, Users users, String code,
			Set<Inviterecord> inviterecords) {
		this.codeId = codeId;
		this.users = users;
		this.code = code;
		this.inviterecords = inviterecords;
	}

	// Property accessors
	@Id
	@Column(name = "code_id", unique = true, nullable = false)
	public Integer getCodeId() {
		return this.codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "systemcode")
	public Set<Inviterecord> getInviterecords() {
		return this.inviterecords;
	}

	public void setInviterecords(Set<Inviterecord> inviterecords) {
		this.inviterecords = inviterecords;
	}

}