package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contentimages entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "contentimages", catalog = "jinzht")
public class Contentimages extends AbstractContentimages implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Contentimages() {
	}

	/** minimal constructor */
	public Contentimages(Integer imageId) {
		super(imageId);
	}

	/** full constructor */
	public Contentimages(Integer imageId, Publiccontent publiccontent,
			Boolean isvalid) {
		super(imageId, publiccontent, isvalid);
	}

}
