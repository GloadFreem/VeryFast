package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Action entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "action", catalog = "jinzht")
public class Action extends AbstractAction implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Action() {
	}

	/** minimal constructor */
	public Action(Integer actionId) {
		super(actionId);
	}

	/** full constructor */
	public Action(Integer actionId, String name, String address,
			String description, String initiateUser, Short memberLimit,
			Timestamp startTime, Timestamp endTime,
			Set<Actionprise> actionprises, Attention attention,
			Set<Actioncomment> actioncomments, Set<Actionshare> actionshares) {
		super(actionId, name, address, description, initiateUser, memberLimit,
				startTime, endTime, actionprises, attention, actioncomments,
				actionshares);
	}

}
