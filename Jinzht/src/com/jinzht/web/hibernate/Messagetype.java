package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Messagetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "messagetype", catalog = "jinzht")
public class Messagetype extends AbstractMessagetype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Messagetype() {
	}

	/** minimal constructor */
	public Messagetype(Integer messageTypeId) {
		super(messageTypeId);
	}

	/** full constructor */
	public Messagetype(Integer messageTypeId, String name,
			Set<Systemmessage> systemmessages) {
		super(messageTypeId, name, systemmessages);
	}

}
