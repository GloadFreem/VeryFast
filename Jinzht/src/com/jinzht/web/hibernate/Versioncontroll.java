package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Versioncontroll entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "versioncontroll", catalog = "jinzht")
public class Versioncontroll extends AbstractVersioncontroll implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Versioncontroll() {
	}

	/** minimal constructor */
	public Versioncontroll(Integer versionId, Timestamp updateTime) {
		super(versionId, updateTime);
	}

	/** full constructor */
	public Versioncontroll(Integer versionId, Timestamp updateTime,
			String content, String url, Short isForce, Short platform) {
		super(versionId, updateTime, content, url, isForce, platform);
	}

}
