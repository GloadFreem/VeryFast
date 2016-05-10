package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Industoryarea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "industoryarea", catalog = "jinzht")
public class Industoryarea extends AbstractIndustoryarea implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Industoryarea() {
	}

	/** minimal constructor */
	public Industoryarea(Integer areaId) {
		super(areaId);
	}

	/** full constructor */
	public Industoryarea(Integer areaId, String name, Boolean isvalid,
			Set<Authentic> authentics) {
		super(areaId, name, isvalid, authentics);
	}

}
