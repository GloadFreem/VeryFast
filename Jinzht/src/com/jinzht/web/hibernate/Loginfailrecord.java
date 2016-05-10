package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Loginfailrecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "loginfailrecord", catalog = "jinzht")
public class Loginfailrecord extends AbstractLoginfailrecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Loginfailrecord() {
	}

	/** minimal constructor */
	public Loginfailrecord(Integer failId) {
		super(failId);
	}

	/** full constructor */
	public Loginfailrecord(Integer failId, Users users, Short count,
			Short platform, Date loginFailDate) {
		super(failId, users, count, platform, loginFailDate);
	}

}
