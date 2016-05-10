package com.jinzht.web.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * AbstractScene entity provides the base persistence definition of the Scene
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractScene implements java.io.Serializable {

	// Fields

	private Integer sceneId;
	private Project project;
	private String audioPath;
	private Long totlalTime;
	private Set<Audiorecord> audiorecords = new HashSet<Audiorecord>(0);

	// Constructors

	/** default constructor */
	public AbstractScene() {
	}

	/** minimal constructor */
	public AbstractScene(Integer sceneId, Project project) {
		this.sceneId = sceneId;
		this.project = project;
	}

	/** full constructor */
	public AbstractScene(Integer sceneId, Project project, String audioPath,
			Long totlalTime, Set<Audiorecord> audiorecords) {
		this.sceneId = sceneId;
		this.project = project;
		this.audioPath = audioPath;
		this.totlalTime = totlalTime;
		this.audiorecords = audiorecords;
	}

	// Property accessors
	@Id
	@Column(name = "scene_id", unique = true, nullable = false)
	public Integer getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Column(name = "audio_path")
	public String getAudioPath() {
		return this.audioPath;
	}

	public void setAudioPath(String audioPath) {
		this.audioPath = audioPath;
	}

	@Column(name = "totlal_time")
	public Long getTotlalTime() {
		return this.totlalTime;
	}

	public void setTotlalTime(Long totlalTime) {
		this.totlalTime = totlalTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "scene")
	public Set<Audiorecord> getAudiorecords() {
		return this.audiorecords;
	}

	public void setAudiorecords(Set<Audiorecord> audiorecords) {
		this.audiorecords = audiorecords;
	}

}