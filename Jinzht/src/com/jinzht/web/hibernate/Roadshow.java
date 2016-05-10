package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Roadshow entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roadshow", catalog = "jinzht")
public class Roadshow extends AbstractRoadshow implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Roadshow() {
	}

	/** minimal constructor */
	public Roadshow(Integer roadShowId) {
		super(roadShowId);
	}

	/** full constructor */
	public Roadshow(Integer roadShowId, Project project,
			Roadshowplan roadshowplan) {
		super(roadShowId, project, roadshowplan);
	}

}
