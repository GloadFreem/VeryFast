package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Collection entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "collection", catalog = "jinzht")
public class Collection extends AbstractCollection implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Collection() {
	}

	/** minimal constructor */
	public Collection(Integer collectionId, Project project) {
		super(collectionId, project);
	}

	/** full constructor */
	public Collection(Integer collectionId, Users users, Project project,
			String projectId) {
		super(collectionId, users, project, projectId);
	}

}
