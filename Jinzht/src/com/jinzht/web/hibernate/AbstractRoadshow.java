package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractRoadshow entity provides the base persistence definition of the
 * Roadshow entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractRoadshow implements java.io.Serializable {

	// Fields

	private Integer roadShowId;
	private Project project;
	private Roadshowplan roadshowplan;

	// Constructors

	/** default constructor */
	public AbstractRoadshow() {
	}

	/** minimal constructor */
	public AbstractRoadshow(Integer roadShowId) {
		this.roadShowId = roadShowId;
	}

	/** full constructor */
	public AbstractRoadshow(Integer roadShowId, Project project,
			Roadshowplan roadshowplan) {
		this.roadShowId = roadShowId;
		this.project = project;
		this.roadshowplan = roadshowplan;
	}

	// Property accessors
	@Id
	@Column(name = "road_show_id", unique = true, nullable = false)
	public Integer getRoadShowId() {
		return this.roadShowId;
	}

	public void setRoadShowId(Integer roadShowId) {
		this.roadShowId = roadShowId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project_id")
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plan_id")
	public Roadshowplan getRoadshowplan() {
		return this.roadshowplan;
	}

	public void setRoadshowplan(Roadshowplan roadshowplan) {
		this.roadshowplan = roadshowplan;
	}

}