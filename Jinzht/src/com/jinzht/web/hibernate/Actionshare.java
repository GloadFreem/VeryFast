package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Actionshare entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "actionshare", catalog = "jinzht")
public class Actionshare extends AbstractActionshare implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Actionshare() {
	}

	/** minimal constructor */
	public Actionshare(Integer shareId, Users users) {
		super(shareId, users);
	}

	/** full constructor */
	public Actionshare(Integer shareId, Action action, Users users,
			String content) {
		super(shareId, action, users, content);
	}

}
