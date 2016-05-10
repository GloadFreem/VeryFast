package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Sharetype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sharetype", catalog = "jinzht")
public class Sharetype extends AbstractSharetype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Sharetype() {
	}

	/** minimal constructor */
	public Sharetype(Integer shareTypeId) {
		super(shareTypeId);
	}

	/** full constructor */
	public Sharetype(Integer shareTypeId, String name, Set<Share> shares) {
		super(shareTypeId, name, shares);
	}

}
