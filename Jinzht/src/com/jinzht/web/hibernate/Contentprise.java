package com.jinzht.web.hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contentprise entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "contentprise", catalog = "jinzht")
public class Contentprise extends AbstractContentprise implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Contentprise() {
	}

	/** minimal constructor */
	public Contentprise(Integer priseId) {
		super(priseId);
	}

	/** full constructor */
	public Contentprise(Integer priseId, Users users,
			Publiccontent publiccontent) {
		super(priseId, users, publiccontent);
	}

}
