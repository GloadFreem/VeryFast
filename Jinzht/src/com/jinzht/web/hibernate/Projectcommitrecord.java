package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Projectcommitrecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "projectcommitrecord", catalog = "jinzht")
public class Projectcommitrecord extends AbstractProjectcommitrecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Projectcommitrecord() {
	}

	/** minimal constructor */
	public Projectcommitrecord(Integer recordId, Users users) {
		super(recordId, users);
	}

	/** full constructor */
	public Projectcommitrecord(Integer recordId, Users users, Project project,
			Status status, Date recordDate) {
		super(recordId, users, project, status, recordDate);
	}

}
