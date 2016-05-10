package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Chargetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "chargetype", catalog = "jinzht")
public class Chargetype extends AbstractChargetype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Chargetype() {
	}

	/** minimal constructor */
	public Chargetype(Integer rechargeStatusId) {
		super(rechargeStatusId);
	}

	/** full constructor */
	public Chargetype(Integer rechargeStatusId, Integer name,
			Timestamp isvalid, Traderecord traderecord) {
		super(rechargeStatusId, name, isvalid, traderecord);
	}

}
