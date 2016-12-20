package com.fengdai.suggestion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fengdai.suggestion.dao.MySuggestionDao;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;

@Service
public class MySuggestionServiceImpl implements MySuggestionService{
	
	@Autowired
	private MySuggestionDao  mySuggestionDao;
	
	@Override
	public  MySuggestion selectByPrimaryKey(String id){
		return 	mySuggestionDao.selectByPrimaryKey(id);
	}
}
