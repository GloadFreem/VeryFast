package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Systemmessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "systemmessage", catalog = "jinzht")
public class Systemmessage extends AbstractSystemmessage implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Systemmessage() {
	}

	/** minimal constructor */
	public Systemmessage(Integer messageId) {
		super(messageId);
	}

	/** full constructor */
	public Systemmessage(Integer messageId, Users users,
			Messagetype messagetype, String content, Date messageDate) {
		super(messageId, users, messagetype, content, messageDate);
	}

}
