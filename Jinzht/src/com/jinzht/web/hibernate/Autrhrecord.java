package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Autrhrecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "autrhrecord", catalog = "jinzht")
public class Autrhrecord extends AbstractAutrhrecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Autrhrecord() {
	}

	/** full constructor */
	public Autrhrecord(Integer authRecordId, Authentic authentic, Date authDate) {
		super(authRecordId, authentic, authDate);
	}

}
