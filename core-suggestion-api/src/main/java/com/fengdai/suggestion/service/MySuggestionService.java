package com.fengdai.suggestion.service;

import com.fengdai.base.exception.BusinessException;
import com.fengdai.suggestion.model.MySuggestion;

public interface MySuggestionService {
	MySuggestion selectByPrimaryKey(String id) throws BusinessException;
}	
