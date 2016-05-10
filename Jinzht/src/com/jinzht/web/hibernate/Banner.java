package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Banner entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "banner", catalog = "jinzht")
public class Banner extends AbstractBanner implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Banner() {
	}

	/** minimal constructor */
	public Banner(Integer bannerId) {
		super(bannerId);
	}

	/** full constructor */
	public Banner(Integer bannerId, String name, String description,
			String image, String bannerType, String url) {
		super(bannerId, name, description, image, bannerType, url);
	}

}
