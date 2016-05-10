package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Projectimages entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "projectimages", catalog = "jinzht")
public class Projectimages extends AbstractProjectimages implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Projectimages() {
	}

	/** minimal constructor */
	public Projectimages(Integer projectImageId) {
		super(projectImageId);
	}

	/** full constructor */
	public Projectimages(Integer projectImageId, Project project,
			String imageUrl) {
		super(projectImageId, project, imageUrl);
	}

}
