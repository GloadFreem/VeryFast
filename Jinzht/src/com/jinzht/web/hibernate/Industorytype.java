package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Industorytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "industorytype", catalog = "jinzht")
public class Industorytype extends AbstractIndustorytype implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Industorytype() {
	}

	/** minimal constructor */
	public Industorytype(Integer industoryId) {
		super(industoryId);
	}

	/** full constructor */
	public Industorytype(Integer industoryId, String name,
			Set<Authentic> authentics) {
		super(industoryId, name, authentics);
	}

}
