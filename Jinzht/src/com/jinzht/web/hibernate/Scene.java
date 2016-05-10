package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Scene entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "scene", catalog = "jinzht")
public class Scene extends AbstractScene implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Scene() {
	}

	/** minimal constructor */
	public Scene(Integer sceneId, Project project) {
		super(sceneId, project);
	}

	/** full constructor */
	public Scene(Integer sceneId, Project project, String audioPath,
			Long totlalTime, Set<Audiorecord> audiorecords) {
		super(sceneId, project, audioPath, totlalTime, audiorecords);
	}

}
