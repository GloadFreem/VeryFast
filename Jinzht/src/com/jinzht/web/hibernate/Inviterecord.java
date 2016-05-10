package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Inviterecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "inviterecord", catalog = "jinzht")
public class Inviterecord extends AbstractInviterecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Inviterecord() {
	}

	/** minimal constructor */
	public Inviterecord(Integer inviteId) {
		super(inviteId);
	}

	/** full constructor */
	public Inviterecord(Integer inviteId, Users users, Systemcode systemcode,
			Date inviteDate) {
		super(inviteId, users, systemcode, inviteDate);
	}

}
