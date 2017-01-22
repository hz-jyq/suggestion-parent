package com.fengdai.suggestion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengdai.base.exception.BusinessException;
import com.fengdai.base.exception.ErrorCode;
import com.fengdai.suggestion.Dto.MySuggestionDto;
import com.fengdai.suggestion.dao.MySuggestionDao;
import com.fengdai.suggestion.form.MySuggestionForm;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;
import com.github.pagehelper.PageInfo;

public class MySuggestionServiceImpl implements MySuggestionService {

	@Autowired
	private MySuggestionDao mySuggestionDao;

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "classpath:config/dubbo-taihe-consumer-beans.xml" });

	@Override
	public MySuggestion selectByPrimaryKey(String id)throws BusinessException{
		if(id==null){
			throw new BusinessException(ErrorCode.ERROR_NOT_NULL_ERROR);
		}
		return mySuggestionDao.selectByPrimaryKey(id);
	}
	
	public  PageInfo<MySuggestion> pageMySuggestion(MySuggestionForm suggestionForm){
		PageInfo<MySuggestion>  page=new PageInfo<MySuggestion>(mySuggestionDao.selectByForm(suggestionForm));
		List<MySuggestionDto> s=new ArrayList<MySuggestionDto>();
		List<MySuggestion> ss=new ArrayList<MySuggestion>(s);
		return page;
	}
}
