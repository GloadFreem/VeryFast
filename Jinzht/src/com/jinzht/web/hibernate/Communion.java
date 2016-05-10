package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Communion entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "communion", catalog = "jinzht")
public class Communion extends AbstractCommunion implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Communion() {
	}

	/** minimal constructor */
	public Communion(Integer interactionId) {
		super(interactionId);
	}

	/** full constructor */
	public Communion(Integer interactionId, Users users, Project project,
			String content, Date interactionDate) {
		super(interactionId, users, project, content, interactionDate);
	}

}
