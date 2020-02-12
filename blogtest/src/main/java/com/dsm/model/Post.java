package com.dsm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="title")
    private String title;

    @Column(name="short_description")
    private String shortDescription;

    @Column(name="description")
    private String description;

    @Column(name="meta")
    private String meta;

    @Column(name="url_slug")
    private String urlSlug;

    @Column(name="published")
    private Boolean published;

    @Column(name="posted_on")
    private Date postedOn;

    @Column(name="modified")
    private Date modified;

    @Column(name="category")
    private String category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getUrlSlug() {
		return urlSlug;
	}

	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}

	public Boolean getPublished() {
		return published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}