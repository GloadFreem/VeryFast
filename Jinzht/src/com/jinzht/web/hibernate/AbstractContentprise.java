package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * AbstractContentprise entity provides the base persistence definition of the
 * Contentprise entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractContentprise implements java.io.Serializable {

	// Fields

	private Integer priseId;
	private Users users;
	private Publiccontent publiccontent;

	// Constructors

	/** default constructor */
	public AbstractContentprise() {
	}

	/** minimal constructor */
	public AbstractContentprise(Integer priseId) {
		this.priseId = priseId;
	}

	/** full constructor */
	public AbstractContentprise(Integer priseId, Users users,
			Publiccontent publiccontent) {
		this.priseId = priseId;
		this.users = users;
		this.publiccontent = publiccontent;
	}

	// Property accessors
	@Id
	@Column(name = "prise_id", unique = true, nullable = false)
	public Integer getPriseId() {
		return this.priseId;
	}

	public void setPriseId(Integer priseId) {
		this.priseId = priseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "public_content_id")
	public Publiccontent getPubliccontent() {
		return this.publiccontent;
	}

	public void setPubliccontent(Publiccontent publiccontent) {
		this.publiccontent = publiccontent;
	}

}