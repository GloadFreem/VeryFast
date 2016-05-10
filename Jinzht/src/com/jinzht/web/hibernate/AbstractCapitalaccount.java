package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractCapitalaccount entity provides the base persistence definition of the
 * Capitalaccount entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractCapitalaccount implements java.io.Serializable {

	// Fields

	private Integer capitalAccountId;
	private Users users;
	private Integer mount;
	private Integer usableMoney;
	private Integer unusableMoney;

	// Constructors

	/** default constructor */
	public AbstractCapitalaccount() {
	}

	/** minimal constructor */
	public AbstractCapitalaccount(Integer capitalAccountId) {
		this.capitalAccountId = capitalAccountId;
	}

	/** full constructor */
	public AbstractCapitalaccount(Integer capitalAccountId, Users users,
			Integer mount, Integer usableMoney, Integer unusableMoney) {
		this.capitalAccountId = capitalAccountId;
		this.users = users;
		this.mount = mount;
		this.usableMoney = usableMoney;
		this.unusableMoney = unusableMoney;
	}

	// Property accessors
	@Id
	@Column(name = "capital_account_id", unique = true, nullable = false)
	public Integer getCapitalAccountId() {
		return this.capitalAccountId;
	}

	public void setCapitalAccountId(Integer capitalAccountId) {
		this.capitalAccountId = capitalAccountId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "mount")
	public Integer getMount() {
		return this.mount;
	}

	public void setMount(Integer mount) {
		this.mount = mount;
	}

	@Column(name = "usable_money")
	public Integer getUsableMoney() {
		return this.usableMoney;
	}

	public void setUsableMoney(Integer usableMoney) {
		this.usableMoney = usableMoney;
	}

	@Column(name = "unusable_money")
	public Integer getUnusableMoney() {
		return this.unusableMoney;
	}

	public void setUnusableMoney(Integer unusableMoney) {
		this.unusableMoney = unusableMoney;
	}

}