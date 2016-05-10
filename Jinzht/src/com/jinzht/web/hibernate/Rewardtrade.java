package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Rewardtrade entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rewardtrade", catalog = "jinzht")
public class Rewardtrade extends AbstractRewardtrade implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rewardtrade() {
	}

	/** minimal constructor */
	public Rewardtrade(Integer rewardTradeId) {
		super(rewardTradeId);
	}

	/** full constructor */
	public Rewardtrade(Integer rewardTradeId, Rewardtradetype rewardtradetype,
			Rewardsystem rewardsystem, Integer tradeType, Integer count) {
		super(rewardTradeId, rewardtradetype, rewardsystem, tradeType, count);
	}

}
