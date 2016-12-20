package com.fengdai.suggestion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.fengdai.suggestion.dao.MySuggestionDao;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;
import com.tairan.cloud.credit.domain.nfcs.QueryCredit;
import com.tairan.cloud.credit.service.FengdaiCreditService;


public class MySuggestionServiceImpl implements MySuggestionService{
	
	@Autowired
	private MySuggestionDao  mySuggestionDao;
	
	ClassPathXmlApplicationContext  context=new ClassPathXmlApplicationContext("classpath:config/dubbo-taihe-consumer-beans.xml");
	@Override
	public  MySuggestion selectByPrimaryKey(String id){
		FengdaiCreditService fengdaiCreditService=context.getBean(FengdaiCreditService.class);
		QueryCredit queryCredit=new QueryCredit();
		String json=fengdaiCreditService.collectNfcsInfo(queryCredit);
		return 	mySuggestionDao.selectByPrimaryKey(id);
	}
	
	
}
