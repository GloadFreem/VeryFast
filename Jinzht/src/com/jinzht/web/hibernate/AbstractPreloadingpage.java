package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractPreloadingpage entity provides the base persistence definition of the
 * Preloadingpage entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractPreloadingpage implements java.io.Serializable {

	// Fields

	private Integer startPageId;
	private String description;
	private String imagePath;
	private Timestamp updateTime;
	private Timestamp showTime;

	// Constructors

	/** default constructor */
	public AbstractPreloadingpage() {
	}

	/** minimal constructor */
	public AbstractPreloadingpage(Integer startPageId, Timestamp updateTime,
			Timestamp showTime) {
		this.startPageId = startPageId;
		this.updateTime = updateTime;
		this.showTime = showTime;
	}

	/** full constructor */
	public AbstractPreloadingpage(Integer startPageId, String description,
			String imagePath, Timestamp updateTime, Timestamp showTime) {
		this.startPageId = startPageId;
		this.description = description;
		this.imagePath = imagePath;
		this.updateTime = updateTime;
		this.showTime = showTime;
	}

	// Property accessors
	@Id
	@Column(name = "start_page_id", unique = true, nullable = false)
	public Integer getStartPageId() {
		return this.startPageId;
	}

	public void setStartPageId(Integer startPageId) {
		this.startPageId = startPageId;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "image_path", length = 200)
	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "update_time", nullable = false, length = 0)
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "show_time", nullable = false, length = 0)
	public Timestamp getShowTime() {
		return this.showTime;
	}

	public void setShowTime(Timestamp showTime) {
		this.showTime = showTime;
	}

}