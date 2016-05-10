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
 * AbstractSharetype entity provides the base persistence definition of the
 * Sharetype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractSharetype implements java.io.Serializable {

	// Fields

	private Integer shareTypeId;
	private String name;
	private Set<Share> shares = new HashSet<Share>(0);

	// Constructors

	/** default constructor */
	public AbstractSharetype() {
	}

	/** minimal constructor */
	public AbstractSharetype(Integer shareTypeId) {
		this.shareTypeId = shareTypeId;
	}

	/** full constructor */
	public AbstractSharetype(Integer shareTypeId, String name, Set<Share> shares) {
		this.shareTypeId = shareTypeId;
		this.name = name;
		this.shares = shares;
	}

	// Property accessors
	@Id
	@Column(name = "share_type_id", unique = true, nullable = false)
	public Integer getShareTypeId() {
		return this.shareTypeId;
	}

	public void setShareTypeId(Integer shareTypeId) {
		this.shareTypeId = shareTypeId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sharetype")
	public Set<Share> getShares() {
		return this.shares;
	}

	public void setShares(Set<Share> shares) {
		this.shares = shares;
	}

}