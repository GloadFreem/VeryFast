package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Preloadingpage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "preloadingpage", catalog = "jinzht")
public class Preloadingpage extends AbstractPreloadingpage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Preloadingpage() {
	}

	/** minimal constructor */
	public Preloadingpage(Integer startPageId, Timestamp updateTime,
			Timestamp showTime) {
		super(startPageId, updateTime, showTime);
	}

	/** full constructor */
	public Preloadingpage(Integer startPageId, String description,
			String imagePath, Timestamp updateTime, Timestamp showTime) {
		super(startPageId, description, imagePath, updateTime, showTime);
	}

}
