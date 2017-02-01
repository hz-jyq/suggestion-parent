package com.fengdai.suggestion.form;

import javax.ws.rs.QueryParam;

import com.fengdai.base.form.AbstractPageForm;

public class MySuggestionForm extends AbstractPageForm {
	
	private static final long serialVersionUID = 5388424862764009024L;
	
	@QueryParam("context")
	private String context;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}
