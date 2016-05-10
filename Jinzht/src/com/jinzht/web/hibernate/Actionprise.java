package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Actionprise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "actionprise", catalog = "jinzht")
public class Actionprise extends AbstractActionprise implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Actionprise() {
	}

	/** minimal constructor */
	public Actionprise(Integer priseId) {
		super(priseId);
	}

	/** full constructor */
	public Actionprise(Integer priseId, Users users, Action action) {
		super(priseId, users, action);
	}

}
