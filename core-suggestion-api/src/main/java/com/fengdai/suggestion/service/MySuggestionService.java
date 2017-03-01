package com.fengdai.suggestion.service;

import com.fengdai.base.exception.BusinessException;
import com.fengdai.suggestion.form.MySuggestionForm;
import com.fengdai.suggestion.model.MySuggestion;
import com.github.pagehelper.PageInfo;

public interface MySuggestionService {
	
	MySuggestion selectByPrimaryKey(String id) throws BusinessException;
	
	PageInfo<MySuggestion> pageMySuggestion(MySuggestionForm suggestionForm);
	
	int save(MySuggestion MySuggestion);
	
	int update(MySuggestion MySuggestio);

	void lockSelete(MySuggestion MySuggestion);
}	
