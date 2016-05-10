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
 * AbstractRewardsystem entity provides the base persistence definition of the
 * Rewardsystem entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractRewardsystem implements java.io.Serializable {

	// Fields

	private Integer rewardId;
	private Users users;
	private Integer count;
	private Set<Rewardtrade> rewardtrades = new HashSet<Rewardtrade>(0);

	// Constructors

	/** default constructor */
	public AbstractRewardsystem() {
	}

	/** minimal constructor */
	public AbstractRewardsystem(Integer rewardId) {
		this.rewardId = rewardId;
	}

	/** full constructor */
	public AbstractRewardsystem(Integer rewardId, Users users, Integer count,
			Set<Rewardtrade> rewardtrades) {
		this.rewardId = rewardId;
		this.users = users;
		this.count = count;
		this.rewardtrades = rewardtrades;
	}

	// Property accessors
	@Id
	@Column(name = "reward_id", unique = true, nullable = false)
	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
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
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rewardsystem")
	public Set<Rewardtrade> getRewardtrades() {
		return this.rewardtrades;
	}

	public void setRewardtrades(Set<Rewardtrade> rewardtrades) {
		this.rewardtrades = rewardtrades;
	}

}