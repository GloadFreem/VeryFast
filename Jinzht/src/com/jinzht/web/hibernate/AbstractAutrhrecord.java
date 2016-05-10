package com.jinzht.web.hibernate;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AbstractAutrhrecord entity provides the base persistence definition of the
 * Autrhrecord entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractAutrhrecord implements java.io.Serializable {

	// Fields

	private Integer authRecordId;
	private Authentic authentic;
	private Date authDate;

	// Constructors

	/** default constructor */
	public AbstractAutrhrecord() {
	}

	/** full constructor */
	public AbstractAutrhrecord(Integer authRecordId, Authentic authentic,
			Date authDate) {
		this.authRecordId = authRecordId;
		this.authentic = authentic;
		this.authDate = authDate;
	}

	// Property accessors
	@Id
	@Column(name = "auth_record_id", unique = true, nullable = false)
	public Integer getAuthRecordId() {
		return this.authRecordId;
	}

	public void setAuthRecordId(Integer authRecordId) {
		this.authRecordId = authRecordId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Authentic getAuthentic() {
		return this.authentic;
	}

	public void setAuthentic(Authentic authentic) {
		this.authentic = authentic;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "auth_date", nullable = false, length = 0)
	public Date getAuthDate() {
		return this.authDate;
	}

	public void setAuthDate(Date authDate) {
		this.authDate = authDate;
	}

}