package com.fengdai.suggestion.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengdai.base.exception.BusinessException;
import com.fengdai.base.exception.ErrorCode;
import com.fengdai.suggestion.dao.MySuggestionDao;
import com.fengdai.suggestion.form.MySuggestionForm;
import com.fengdai.suggestion.model.MySuggestion;
import com.fengdai.suggestion.service.MySuggestionService;
import com.github.pagehelper.PageInfo;

public class MySuggestionServiceImpl implements MySuggestionService {

	@Autowired
	private MySuggestionDao mySuggestionDao;
	
	private Logger log = LoggerFactory.getLogger(MySuggestionServiceImpl.class);

	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			new String[] { "classpath:config/dubbo-taihe-consumer-beans.xml" });

	@Override
	public MySuggestion selectByPrimaryKey(String id)throws BusinessException{
		if(id==null || id.equals("")){
			log.error("错误");
			throw new BusinessException(ErrorCode.ERROR_NOT_NULL_ERROR);
		}
		return mySuggestionDao.selectByPrimaryKey(id);
	}
	
	public  PageInfo<MySuggestion> pageMySuggestion(MySuggestionForm suggestionForm){
		PageInfo<MySuggestion>  page=new PageInfo<MySuggestion>(mySuggestionDao.selectByForm(suggestionForm));
		return page;
	}

	@Override
	public int save(MySuggestion mySuggestion) {
		mySuggestion.setContext("11");
		mySuggestion.setId("555");
		mySuggestionDao.save(mySuggestion);
		return 0;
	}
	
	@Override
	public void lockSelete(MySuggestion mySuggestion) {
		
	}

	@Override
	public int update(MySuggestion mySuggestion) {
		mySuggestionDao.update(mySuggestion);
		return 0;
	}
}
