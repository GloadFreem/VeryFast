package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "notice", catalog = "jinzht")
public class Notice extends AbstractNotice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** minimal constructor */
	public Notice(Integer noticeId) {
		super(noticeId);
	}

	/** full constructor */
	public Notice(Integer noticeId, String description, String noticeType,
			Timestamp nodiceTime) {
		super(noticeId, description, noticeType, nodiceTime);
	}

}
