package com.jinzht.web.hibernate;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Audiorecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "audiorecord", catalog = "jinzht")
public class Audiorecord extends AbstractAudiorecord implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Audiorecord() {
	}

	/** minimal constructor */
	public Audiorecord(Integer playId) {
		super(playId);
	}

	/** full constructor */
	public Audiorecord(Integer playId, Scene scene, Timestamp playTime,
			String imageUrl) {
		super(playId, scene, playTime, imageUrl);
	}

}
