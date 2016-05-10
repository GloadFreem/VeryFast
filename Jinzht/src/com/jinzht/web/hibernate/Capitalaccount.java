package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Capitalaccount entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "capitalaccount", catalog = "jinzht")
public class Capitalaccount extends AbstractCapitalaccount implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Capitalaccount() {
	}

	/** minimal constructor */
	public Capitalaccount(Integer capitalAccountId) {
		super(capitalAccountId);
	}

	/** full constructor */
	public Capitalaccount(Integer capitalAccountId, Users users, Integer mount,
			Integer usableMoney, Integer unusableMoney) {
		super(capitalAccountId, users, mount, usableMoney, unusableMoney);
	}

}
