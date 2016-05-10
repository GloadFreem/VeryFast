package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Systemcode entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "systemcode", catalog = "jinzht")
public class Systemcode extends AbstractSystemcode implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Systemcode() {
	}

	/** minimal constructor */
	public Systemcode(Integer codeId) {
		super(codeId);
	}

	/** full constructor */
	public Systemcode(Integer codeId, Users users, String code,
			Set<Inviterecord> inviterecords) {
		super(codeId, users, code, inviterecords);
	}

}
