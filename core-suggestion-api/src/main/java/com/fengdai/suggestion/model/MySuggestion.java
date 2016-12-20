package com.fengdai.suggestion.model;

import com.fengdai.base.model.AbstractEntity;

public class MySuggestion  extends AbstractEntity{
	
	private static final long serialVersionUID = 2894479855237059584L;

	private String id;
	private String context;
	private String title;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String primaryKey() {
		return this.id;
	}
}
