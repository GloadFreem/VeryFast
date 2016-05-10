package com.jinzht.web.hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractSustomservice entity provides the base persistence definition of the
 * Sustomservice entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractSustomservice implements java.io.Serializable {

	// Fields

	private Integer customServiceId;
	private String name;

	// Constructors

	/** default constructor */
	public AbstractSustomservice() {
	}

	/** minimal constructor */
	public AbstractSustomservice(Integer customServiceId) {
		this.customServiceId = customServiceId;
	}

	/** full constructor */
	public AbstractSustomservice(Integer customServiceId, String name) {
		this.customServiceId = customServiceId;
		this.name = name;
	}

	// Property accessors
	@Id
	@Column(name = "custom_service_id", unique = true, nullable = false)
	public Integer getCustomServiceId() {
		return this.customServiceId;
	}

	public void setCustomServiceId(Integer customServiceId) {
		this.customServiceId = customServiceId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}