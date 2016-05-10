package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Rewardtradetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rewardtradetype", catalog = "jinzht")
public class Rewardtradetype extends AbstractRewardtradetype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Rewardtradetype() {
	}

	/** minimal constructor */
	public Rewardtradetype(Integer rewardTypeId) {
		super(rewardTypeId);
	}

	/** full constructor */
	public Rewardtradetype(Integer rewardTypeId, String name,
			Set<Rewardtrade> rewardtrades) {
		super(rewardTypeId, name, rewardtrades);
	}

}
