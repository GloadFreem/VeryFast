package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractNotice entity provides the base persistence definition of the Notice
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractNotice implements java.io.Serializable {

	// Fields

	private Integer noticeId;
	private String description;
	private String noticeType;
	private Timestamp nodiceTime;

	// Constructors

	/** default constructor */
	public AbstractNotice() {
	}

	/** minimal constructor */
	public AbstractNotice(Integer noticeId) {
		this.noticeId = noticeId;
	}

	/** full constructor */
	public AbstractNotice(Integer noticeId, String description,
			String noticeType, Timestamp nodiceTime) {
		this.noticeId = noticeId;
		this.description = description;
		this.noticeType = noticeType;
		this.nodiceTime = nodiceTime;
	}

	// Property accessors
	@Id
	@Column(name = "notice_id", unique = true, nullable = false)
	public Integer getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "notice_type", length = 200)
	public String getNoticeType() {
		return this.noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}

	@Column(name = "nodice_time", length = 0)
	public Timestamp getNodiceTime() {
		return this.nodiceTime;
	}

	public void setNodiceTime(Timestamp nodiceTime) {
		this.nodiceTime = nodiceTime;
	}

}