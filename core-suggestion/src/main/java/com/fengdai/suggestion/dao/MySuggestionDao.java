package com.fengdai.suggestion.dao;

import com.fengdai.suggestion.model.MySuggestion;

public interface MySuggestionDao {
	 MySuggestion selectByPrimaryKey(String id);
}
