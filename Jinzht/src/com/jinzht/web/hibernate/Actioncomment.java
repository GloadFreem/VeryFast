package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Actioncomment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "actioncomment", catalog = "jinzht")
public class Actioncomment extends AbstractActioncomment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Actioncomment() {
	}

	/** minimal constructor */
	public Actioncomment(Integer commentId) {
		super(commentId);
	}

	/** full constructor */
	public Actioncomment(Integer commentId, Users users, Action action,
			String content) {
		super(commentId, users, action, content);
	}

}
