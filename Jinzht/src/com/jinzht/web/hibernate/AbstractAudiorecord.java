package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractAudiorecord entity provides the base persistence definition of the
 * Audiorecord entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractAudiorecord implements java.io.Serializable {

	// Fields

	private Integer playId;
	private Scene scene;
	private Timestamp playTime;
	private String imageUrl;

	// Constructors

	/** default constructor */
	public AbstractAudiorecord() {
	}

	/** minimal constructor */
	public AbstractAudiorecord(Integer playId) {
		this.playId = playId;
	}

	/** full constructor */
	public AbstractAudiorecord(Integer playId, Scene scene, Timestamp playTime,
			String imageUrl) {
		this.playId = playId;
		this.scene = scene;
		this.playTime = playTime;
		this.imageUrl = imageUrl;
	}

	// Property accessors
	@Id
	@Column(name = "play_id", unique = true, nullable = false)
	public Integer getPlayId() {
		return this.playId;
	}

	public void setPlayId(Integer playId) {
		this.playId = playId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "scene_id")
	public Scene getScene() {
		return this.scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	@Column(name = "play_time", length = 0)
	public Timestamp getPlayTime() {
		return this.playTime;
	}

	public void setPlayTime(Timestamp playTime) {
		this.playTime = playTime;
	}

	@Column(name = "image_url")
	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}