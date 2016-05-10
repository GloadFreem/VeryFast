package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Comment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "comment", catalog = "jinzht")
public class Comment extends AbstractComment implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Comment() {
	}

	/** minimal constructor */
	public Comment(Integer commentId) {
		super(commentId);
	}

	/** full constructor */
	public Comment(Integer commentId, Users users, Publiccontent publiccontent,
			String content) {
		super(commentId, users, publiccontent, content);
	}

}
