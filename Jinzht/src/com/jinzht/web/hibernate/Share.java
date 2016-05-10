package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Share entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "share", catalog = "jinzht")
public class Share extends AbstractShare implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Share() {
	}

	/** minimal constructor */
	public Share(Integer shareId) {
		super(shareId);
	}

	/** full constructor */
	public Share(Integer shareId, Sharetype sharetype, Timestamp shareDate,
			String content, String url) {
		super(shareId, sharetype, shareDate, content, url);
	}

}
