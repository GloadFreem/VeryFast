package com.jinzht.web.hibernate;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "users", catalog = "jinzht")
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Integer userId, String telephone, String password) {
		super(userId, telephone, password);
	}

	/** full constructor */
	public Users(Integer userId, Userstatus userstatus, String telephone,
			String password, String headSculpture, Date lastLoginDate,
			Short platform, Set<Comment> comments, Set<Collection> collections,
			Set<Communion> communions, Set<Inviterecord> inviterecords,
			Set<Authentic> authentics, Set<Attention> attentions,
			Set<Systemmessage> systemmessages, Set<Rewardsystem> rewardsystems,
			Set<Actionprise> actionprises, Set<Capitalaccount> capitalaccounts,
			Publiccontent publiccontent,
			Set<Investmentrecord> investmentrecords,
			Set<Contentprise> contentprises,
			Projectcommitrecord projectcommitrecord,
			Set<Traderecord> traderecords, Set<Systemcode> systemcodes,
			Actionshare actionshare, Set<Actioncomment> actioncomments,
			Set<Loginfailrecord> loginfailrecords) {
		super(userId, userstatus, telephone, password, headSculpture,
				lastLoginDate, platform, comments, collections, communions,
				inviterecords, authentics, attentions, systemmessages,
				rewardsystems, actionprises, capitalaccounts, publiccontent,
				investmentrecords, contentprises, projectcommitrecord,
				traderecords, systemcodes, actionshare, actioncomments,
				loginfailrecords);
	}

}
