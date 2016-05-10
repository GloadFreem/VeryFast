package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Rewardsystem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rewardsystem", catalog = "jinzht")
public class Rewardsystem extends AbstractRewardsystem implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rewardsystem() {
	}

	/** minimal constructor */
	public Rewardsystem(Integer rewardId) {
		super(rewardId);
	}

	/** full constructor */
	public Rewardsystem(Integer rewardId, Users users, Integer count,
			Set<Rewardtrade> rewardtrades) {
		super(rewardId, users, count, rewardtrades);
	}

}
