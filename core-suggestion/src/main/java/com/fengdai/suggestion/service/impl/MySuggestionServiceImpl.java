package com.fengdai.suggestion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengdai.base.dubbo.configure.CacheClient;
import com.fengdai.suggestion.dao.MySuggestionDao;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;

public class MySuggestionServiceImpl implements MySuggestionService {

	@Autowired
	private MySuggestionDao mySuggestionDao;
	@Autowired
	private CacheClient cacheClient;

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "classpath:config/dubbo-taihe-consumer-beans.xml" });

	@Override
	public MySuggestion selectByPrimaryKey(String id){
/*		FengdaiCreditService fengdaiCreditService = context.getBean(FengdaiCreditService.class);
		QueryCredit queryCredit = new QueryCredit();
		String json = fengdaiCreditService.collectNfcsInfo(queryCredit);*/
		MySuggestion  mySuggestion;
		mySuggestion=(MySuggestion)cacheClient.get("my");
		if(mySuggestion!=null){
			return mySuggestion;
		}
		mySuggestion=mySuggestionDao.selectByPrimaryKey(id);
		cacheClient.set("my",mySuggestion);
		return mySuggestion;
	}
}
