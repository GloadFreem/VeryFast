package com.jinzht.web.hibernate;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 * AbstractMessagetype entity provides the base persistence definition of the
 * Messagetype entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractMessagetype implements java.io.Serializable {

	// Fields

	private Integer messageTypeId;
	private String name;
	private Set<Systemmessage> systemmessages = new HashSet<Systemmessage>(0);

	// Constructors

	/** default constructor */
	public AbstractMessagetype() {
	}

	/** minimal constructor */
	public AbstractMessagetype(Integer messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	/** full constructor */
	public AbstractMessagetype(Integer messageTypeId, String name,
			Set<Systemmessage> systemmessages) {
		this.messageTypeId = messageTypeId;
		this.name = name;
		this.systemmessages = systemmessages;
	}

	// Property accessors
	@Id
	@Column(name = "message_type_id", unique = true, nullable = false)
	public Integer getMessageTypeId() {
		return this.messageTypeId;
	}

	public void setMessageTypeId(Integer messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "messagetype")
	public Set<Systemmessage> getSystemmessages() {
		return this.systemmessages;
	}

	public void setSystemmessages(Set<Systemmessage> systemmessages) {
		this.systemmessages = systemmessages;
	}

}