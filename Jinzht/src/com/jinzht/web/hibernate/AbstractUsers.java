package com.jinzht.web.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AbstractUsers entity provides the base persistence definition of the Users
 * entity. @author MyEclipse Persistence Tools
 */
@MappedSuperclass
public abstract class AbstractUsers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Userstatus userstatus;
	private String telephone;
	private String password;
	private String headSculpture;
	private Date lastLoginDate;
	private Short platform;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Collection> collections = new HashSet<Collection>(0);
	private Set<Communion> communions = new HashSet<Communion>(0);
	private Set<Inviterecord> inviterecords = new HashSet<Inviterecord>(0);
	private Set<Authentic> authentics = new HashSet<Authentic>(0);
	private Set<Attention> attentions = new HashSet<Attention>(0);
	private Set<Systemmessage> systemmessages = new HashSet<Systemmessage>(0);
	private Set<Rewardsystem> rewardsystems = new HashSet<Rewardsystem>(0);
	private Set<Actionprise> actionprises = new HashSet<Actionprise>(0);
	private Set<Capitalaccount> capitalaccounts = new HashSet<Capitalaccount>(0);
	private Publiccontent publiccontent;
	private Set<Investmentrecord> investmentrecords = new HashSet<Investmentrecord>(
			0);
	private Set<Contentprise> contentprises = new HashSet<Contentprise>(0);
	private Projectcommitrecord projectcommitrecord;
	private Set<Traderecord> traderecords = new HashSet<Traderecord>(0);
	private Set<Systemcode> systemcodes = new HashSet<Systemcode>(0);
	private Actionshare actionshare;
	private Set<Actioncomment> actioncomments = new HashSet<Actioncomment>(0);
	private Set<Loginfailrecord> loginfailrecords = new HashSet<Loginfailrecord>(
			0);

	// Constructors

	/** default constructor */
	public AbstractUsers() {
	}

	/** minimal constructor */
	public AbstractUsers(Integer userId, String telephone, String password) {
		this.userId = userId;
		this.telephone = telephone;
		this.password = password;
	}

	/** full constructor */
	public AbstractUsers(Integer userId, Userstatus userstatus,
			String telephone, String password, String headSculpture,
			Date lastLoginDate, Short platform, Set<Comment> comments,
			Set<Collection> collections, Set<Communion> communions,
			Set<Inviterecord> inviterecords, Set<Authentic> authentics,
			Set<Attention> attentions, Set<Systemmessage> systemmessages,
			Set<Rewardsystem> rewardsystems, Set<Actionprise> actionprises,
			Set<Capitalaccount> capitalaccounts, Publiccontent publiccontent,
			Set<Investmentrecord> investmentrecords,
			Set<Contentprise> contentprises,
			Projectcommitrecord projectcommitrecord,
			Set<Traderecord> traderecords, Set<Systemcode> systemcodes,
			Actionshare actionshare, Set<Actioncomment> actioncomments,
			Set<Loginfailrecord> loginfailrecords) {
		this.userId = userId;
		this.userstatus = userstatus;
		this.telephone = telephone;
		this.password = password;
		this.headSculpture = headSculpture;
		this.lastLoginDate = lastLoginDate;
		this.platform = platform;
		this.comments = comments;
		this.collections = collections;
		this.communions = communions;
		this.inviterecords = inviterecords;
		this.authentics = authentics;
		this.attentions = attentions;
		this.systemmessages = systemmessages;
		this.rewardsystems = rewardsystems;
		this.actionprises = actionprises;
		this.capitalaccounts = capitalaccounts;
		this.publiccontent = publiccontent;
		this.investmentrecords = investmentrecords;
		this.contentprises = contentprises;
		this.projectcommitrecord = projectcommitrecord;
		this.traderecords = traderecords;
		this.systemcodes = systemcodes;
		this.actionshare = actionshare;
		this.actioncomments = actioncomments;
		this.loginfailrecords = loginfailrecords;
	}

	// Property accessors
	@Id
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_status_id")
	public Userstatus getUserstatus() {
		return this.userstatus;
	}

	public void setUserstatus(Userstatus userstatus) {
		this.userstatus = userstatus;
	}

	@Column(name = "telephone", nullable = false, length = 11)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "head_sculpture")
	public String getHeadSculpture() {
		return this.headSculpture;
	}

	public void setHeadSculpture(String headSculpture) {
		this.headSculpture = headSculpture;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_login_date", length = 0)
	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	@Column(name = "platform")
	public Short getPlatform() {
		return this.platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Collection> getCollections() {
		return this.collections;
	}

	public void setCollections(Set<Collection> collections) {
		this.collections = collections;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Communion> getCommunions() {
		return this.communions;
	}

	public void setCommunions(Set<Communion> communions) {
		this.communions = communions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Inviterecord> getInviterecords() {
		return this.inviterecords;
	}

	public void setInviterecords(Set<Inviterecord> inviterecords) {
		this.inviterecords = inviterecords;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Authentic> getAuthentics() {
		return this.authentics;
	}

	public void setAuthentics(Set<Authentic> authentics) {
		this.authentics = authentics;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Attention> getAttentions() {
		return this.attentions;
	}

	public void setAttentions(Set<Attention> attentions) {
		this.attentions = attentions;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Systemmessage> getSystemmessages() {
		return this.systemmessages;
	}

	public void setSystemmessages(Set<Systemmessage> systemmessages) {
		this.systemmessages = systemmessages;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Rewardsystem> getRewardsystems() {
		return this.rewardsystems;
	}

	public void setRewardsystems(Set<Rewardsystem> rewardsystems) {
		this.rewardsystems = rewardsystems;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Actionprise> getActionprises() {
		return this.actionprises;
	}

	public void setActionprises(Set<Actionprise> actionprises) {
		this.actionprises = actionprises;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Capitalaccount> getCapitalaccounts() {
		return this.capitalaccounts;
	}

	public void setCapitalaccounts(Set<Capitalaccount> capitalaccounts) {
		this.capitalaccounts = capitalaccounts;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "users")
	public Publiccontent getPubliccontent() {
		return this.publiccontent;
	}

	public void setPubliccontent(Publiccontent publiccontent) {
		this.publiccontent = publiccontent;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Investmentrecord> getInvestmentrecords() {
		return this.investmentrecords;
	}

	public void setInvestmentrecords(Set<Investmentrecord> investmentrecords) {
		this.investmentrecords = investmentrecords;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Contentprise> getContentprises() {
		return this.contentprises;
	}

	public void setContentprises(Set<Contentprise> contentprises) {
		this.contentprises = contentprises;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "users")
	public Projectcommitrecord getProjectcommitrecord() {
		return this.projectcommitrecord;
	}

	public void setProjectcommitrecord(Projectcommitrecord projectcommitrecord) {
		this.projectcommitrecord = projectcommitrecord;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Traderecord> getTraderecords() {
		return this.traderecords;
	}

	public void setTraderecords(Set<Traderecord> traderecords) {
		this.traderecords = traderecords;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Systemcode> getSystemcodes() {
		return this.systemcodes;
	}

	public void setSystemcodes(Set<Systemcode> systemcodes) {
		this.systemcodes = systemcodes;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "users")
	public Actionshare getActionshare() {
		return this.actionshare;
	}

	public void setActionshare(Actionshare actionshare) {
		this.actionshare = actionshare;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Actioncomment> getActioncomments() {
		return this.actioncomments;
	}

	public void setActioncomments(Set<Actioncomment> actioncomments) {
		this.actioncomments = actioncomments;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Loginfailrecord> getLoginfailrecords() {
		return this.loginfailrecords;
	}

	public void setLoginfailrecords(Set<Loginfailrecord> loginfailrecords) {
		this.loginfailrecords = loginfailrecords;
	}

}