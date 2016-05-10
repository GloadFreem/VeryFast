package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractVersioncontroll entity provides the base persistence definition of
 * the Versioncontroll entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractVersioncontroll implements java.io.Serializable {

	// Fields

	private Integer versionId;
	private Timestamp updateTime;
	private String content;
	private String url;
	private Short isForce;
	private Short platform;

	// Constructors

	/** default constructor */
	public AbstractVersioncontroll() {
	}

	/** minimal constructor */
	public AbstractVersioncontroll(Integer versionId, Timestamp updateTime) {
		this.versionId = versionId;
		this.updateTime = updateTime;
	}

	/** full constructor */
	public AbstractVersioncontroll(Integer versionId, Timestamp updateTime,
			String content, String url, Short isForce, Short platform) {
		this.versionId = versionId;
		this.updateTime = updateTime;
		this.content = content;
		this.url = url;
		this.isForce = isForce;
		this.platform = platform;
	}

	// Property accessors
	@Id
	@Column(name = "version_id", unique = true, nullable = false)
	public Integer getVersionId() {
		return this.versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	@Column(name = "update_time", nullable = false, length = 0)
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "url", length = 100)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "is_force")
	public Short getIsForce() {
		return this.isForce;
	}

	public void setIsForce(Short isForce) {
		this.isForce = isForce;
	}

	@Column(name = "platform")
	public Short getPlatform() {
		return this.platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

}