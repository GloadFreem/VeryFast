package com.jinzht.web.hibernate;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Publiccontent entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "publiccontent", catalog = "jinzht")
public class Publiccontent extends AbstractPubliccontent implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Publiccontent() {
	}

	/** minimal constructor */
	public Publiccontent(Integer publicContentId, Users users) {
		super(publicContentId, users);
	}

	/** full constructor */
	public Publiccontent(Integer publicContentId, Users users, String content,
			Set<Contentimages> contentimageses, Set<Comment> comments,
			Set<Contentprise> contentprises) {
		super(publicContentId, users, content, contentimageses, comments,
				contentprises);
	}

}
