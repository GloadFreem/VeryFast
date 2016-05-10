package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Attention entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "attention", catalog = "jinzht")
public class Attention extends AbstractAttention implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Attention() {
	}

	/** minimal constructor */
	public Attention(Integer attendUid, Action action) {
		super(attendUid, action);
	}

	/** full constructor */
	public Attention(Integer attendUid, Action action, Users users,
			String content, Timestamp enrollDate) {
		super(attendUid, action, users, content, enrollDate);
	}

}
