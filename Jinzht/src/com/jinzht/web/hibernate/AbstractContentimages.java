package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractContentimages entity provides the base persistence definition of the
 * Contentimages entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractContentimages implements java.io.Serializable {

	// Fields

	private Integer imageId;
	private Publiccontent publiccontent;
	private Boolean isvalid;

	// Constructors

	/** default constructor */
	public AbstractContentimages() {
	}

	/** minimal constructor */
	public AbstractContentimages(Integer imageId) {
		this.imageId = imageId;
	}

	/** full constructor */
	public AbstractContentimages(Integer imageId, Publiccontent publiccontent,
			Boolean isvalid) {
		this.imageId = imageId;
		this.publiccontent = publiccontent;
		this.isvalid = isvalid;
	}

	// Property accessors
	@Id
	@Column(name = "image_id", unique = true, nullable = false)
	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "public_content_id")
	public Publiccontent getPubliccontent() {
		return this.publiccontent;
	}

	public void setPubliccontent(Publiccontent publiccontent) {
		this.publiccontent = publiccontent;
	}

	@Column(name = "isvalid")
	public Boolean getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Boolean isvalid) {
		this.isvalid = isvalid;
	}

}