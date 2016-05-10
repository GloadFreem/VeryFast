package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tradetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tradetype", catalog = "jinzht")
public class Tradetype extends AbstractTradetype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tradetype() {
	}

	/** minimal constructor */
	public Tradetype(Integer tradeTypeId) {
		super(tradeTypeId);
	}

	/** full constructor */
	public Tradetype(Integer tradeTypeId, String name, Boolean isvalid,
			Set<Traderecord> traderecords) {
		super(tradeTypeId, name, isvalid, traderecords);
	}

}
