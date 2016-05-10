package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * AbstractRoadshowplan entity provides the base persistence definition of the
 * Roadshowplan entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractRoadshowplan implements java.io.Serializable {

	// Fields

	private Integer financingId;
	private Timestamp beginDate;
	private Timestamp endDate;
	private Integer financeTotal;
	private Integer financedMount;
	private Set<Roadshow> roadshows = new HashSet<Roadshow>(0);

	// Constructors

	/** default constructor */
	public AbstractRoadshowplan() {
	}

	/** minimal constructor */
	public AbstractRoadshowplan(Integer financingId, Timestamp beginDate,
			Timestamp endDate) {
		this.financingId = financingId;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	/** full constructor */
	public AbstractRoadshowplan(Integer financingId, Timestamp beginDate,
			Timestamp endDate, Integer financeTotal, Integer financedMount,
			Set<Roadshow> roadshows) {
		this.financingId = financingId;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.financeTotal = financeTotal;
		this.financedMount = financedMount;
		this.roadshows = roadshows;
	}

	// Property accessors
	@Id
	@Column(name = "financing_id", unique = true, nullable = false)
	public Integer getFinancingId() {
		return this.financingId;
	}

	public void setFinancingId(Integer financingId) {
		this.financingId = financingId;
	}

	@Column(name = "begin_date", nullable = false, length = 0)
	public Timestamp getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(Timestamp beginDate) {
		this.beginDate = beginDate;
	}

	@Column(name = "end_date", nullable = false, length = 0)
	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	@Column(name = "finance_total")
	public Integer getFinanceTotal() {
		return this.financeTotal;
	}

	public void setFinanceTotal(Integer financeTotal) {
		this.financeTotal = financeTotal;
	}

	@Column(name = "financed_mount")
	public Integer getFinancedMount() {
		return this.financedMount;
	}

	public void setFinancedMount(Integer financedMount) {
		this.financedMount = financedMount;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "roadshowplan")
	public Set<Roadshow> getRoadshows() {
		return this.roadshows;
	}

	public void setRoadshows(Set<Roadshow> roadshows) {
		this.roadshows = roadshows;
	}

}