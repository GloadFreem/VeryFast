package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Projectcomment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "projectcomment", catalog = "jinzht")
public class Projectcomment extends AbstractProjectcomment implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Projectcomment() {
	}

	/** minimal constructor */
	public Projectcomment(Integer commentId) {
		super(commentId);
	}

	/** full constructor */
	public Projectcomment(Integer commentId, Project project, String content) {
		super(commentId, project, content);
	}

}
