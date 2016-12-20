package com.fengdai.suggestion.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import com.fengdai.suggestion.service.MySuggestionService;


public class SuggestionServiceTest  extends BaseTest{

	ContextConfiguration context;
	
	@Resource
	private  MySuggestionService suggestionService;
	

	@Test
	public void testcheckUniqueByName() {
		suggestionService.selectByPrimaryKey("111");
	}
}
