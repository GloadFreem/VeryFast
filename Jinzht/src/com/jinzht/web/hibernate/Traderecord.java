package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Traderecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "traderecord", catalog = "jinzht")
public class Traderecord extends AbstractTraderecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Traderecord() {
	}

	/** minimal constructor */
	public Traderecord(Integer tradeId, Chargetype chargetype) {
		super(tradeId, chargetype);
	}

	/** full constructor */
	public Traderecord(Integer tradeId, Users users, Chargetype chargetype,
			Tradetype tradetype, Float mount, Short tradeType, Integer tradeDate) {
		super(tradeId, users, chargetype, tradetype, mount, tradeType,
				tradeDate);
	}

}
