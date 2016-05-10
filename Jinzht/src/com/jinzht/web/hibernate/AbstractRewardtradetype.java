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
 * AbstractRewardtradetype entity provides the base persistence definition of
 * the Rewardtradetype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractRewardtradetype implements java.io.Serializable {

	// Fields

	private Integer rewardTypeId;
	private String name;
	private Set<Rewardtrade> rewardtrades = new HashSet<Rewardtrade>(0);

	// Constructors

	/** default constructor */
	public AbstractRewardtradetype() {
	}

	/** minimal constructor */
	public AbstractRewardtradetype(Integer rewardTypeId) {
		this.rewardTypeId = rewardTypeId;
	}

	/** full constructor */
	public AbstractRewardtradetype(Integer rewardTypeId, String name,
			Set<Rewardtrade> rewardtrades) {
		this.rewardTypeId = rewardTypeId;
		this.name = name;
		this.rewardtrades = rewardtrades;
	}

	// Property accessors
	@Id
	@Column(name = "reward_type_id", unique = true, nullable = false)
	public Integer getRewardTypeId() {
		return this.rewardTypeId;
	}

	public void setRewardTypeId(Integer rewardTypeId) {
		this.rewardTypeId = rewardTypeId;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rewardtradetype")
	public Set<Rewardtrade> getRewardtrades() {
		return this.rewardtrades;
	}

	public void setRewardtrades(Set<Rewardtrade> rewardtrades) {
		this.rewardtrades = rewardtrades;
	}

}