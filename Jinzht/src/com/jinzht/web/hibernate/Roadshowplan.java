package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Roadshowplan entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "roadshowplan", catalog = "jinzht")
public class Roadshowplan extends AbstractRoadshowplan implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Roadshowplan() {
	}

	/** minimal constructor */
	public Roadshowplan(Integer financingId, Timestamp beginDate,
			Timestamp endDate) {
		super(financingId, beginDate, endDate);
	}

	/** full constructor */
	public Roadshowplan(Integer financingId, Timestamp beginDate,
			Timestamp endDate, Integer financeTotal, Integer financedMount,
			Set<Roadshow> roadshows) {
		super(financingId, beginDate, endDate, financeTotal, financedMount,
				roadshows);
	}

}
