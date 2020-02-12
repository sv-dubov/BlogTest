package com.dsm.dto;

import java.util.Date;

import com.dsm.model.Post;

public class PostDTO {
	private Long id;
	private String title;
	private String shortDescription;
	private String description;
	private String meta;
	private String urlSlug;
	private Boolean published;
	private Date postedOn;
	private Date modified;
	private String category;
	
	public PostDTO() {

	}

	public PostDTO(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.shortDescription = post.getShortDescription();
		this.description = post.getDescription();
		this.meta = post.getMeta();
		this.urlSlug = post.getUrlSlug();
		this.published = post.getPublished();
		this.postedOn = post.getPostedOn();
		this.modified = post.getModified();
		this.category = post.getCategory();
	}

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
