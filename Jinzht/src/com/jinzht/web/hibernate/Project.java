package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "project", catalog = "jinzht")
public class Project extends AbstractProject implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Integer projectId) {
		super(projectId);
	}

	/** full constructor */
	public Project(Integer projectId, Financestatus financestatus,
			String abbrevName, String fullName, String description,
			Short projectType, String address, String startPageImage,
			Scene scene, Set<Communion> communions,
			Set<Projectcomment> projectcomments, Controlreport controlreport,
			Financingexit financingexit, Financialstanding financialstanding,
			Collection collection, Financingcase financingcase,
			Investmentrecord investmentrecord,
			Set<Projectcommitrecord> projectcommitrecords, Set<Team> teams,
			Businessplan businessplan, Set<Member> members,
			Set<Roadshow> roadshows, Set<Projectimages> projectimageses) {
		super(projectId, financestatus, abbrevName, fullName, description,
				projectType, address, startPageImage, scene, communions,
				projectcomments, controlreport, financingexit,
				financialstanding, collection, financingcase, investmentrecord,
				projectcommitrecords, teams, businessplan, members, roadshows,
				projectimageses);
	}

}
