package com.fengdai.suggestion.dao;

import java.util.List;

import com.fengdai.suggestion.form.MySuggestionForm;
import com.fengdai.suggestion.model.MySuggestion;

public interface MySuggestionDao {
	 MySuggestion selectByPrimaryKey(String id);
	 
	 List<MySuggestion>  selectByForm(MySuggestionForm suggestionForm);
	 
	  void save(MySuggestion suggestion);
	  
	  void update(MySuggestion suggestion);
}
