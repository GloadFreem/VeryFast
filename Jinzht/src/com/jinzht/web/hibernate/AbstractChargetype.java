package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * AbstractChargetype entity provides the base persistence definition of the
 * Chargetype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractChargetype implements java.io.Serializable {

	// Fields

	private Integer rechargeStatusId;
	private Integer name;
	private Timestamp isvalid;
	private Traderecord traderecord;

	// Constructors

	/** default constructor */
	public AbstractChargetype() {
	}

	/** minimal constructor */
	public AbstractChargetype(Integer rechargeStatusId) {
		this.rechargeStatusId = rechargeStatusId;
	}

	/** full constructor */
	public AbstractChargetype(Integer rechargeStatusId, Integer name,
			Timestamp isvalid, Traderecord traderecord) {
		this.rechargeStatusId = rechargeStatusId;
		this.name = name;
		this.isvalid = isvalid;
		this.traderecord = traderecord;
	}

	// Property accessors
	@Id
	@Column(name = "recharge_status_id", unique = true, nullable = false)
	public Integer getRechargeStatusId() {
		return this.rechargeStatusId;
	}

	public void setRechargeStatusId(Integer rechargeStatusId) {
		this.rechargeStatusId = rechargeStatusId;
	}

	@Column(name = "name")
	public Integer getName() {
		return this.name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	@Column(name = "isvalid", length = 0)
	public Timestamp getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(Timestamp isvalid) {
		this.isvalid = isvalid;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "chargetype")
	public Traderecord getTraderecord() {
		return this.traderecord;
	}

	public void setTraderecord(Traderecord traderecord) {
		this.traderecord = traderecord;
	}

}