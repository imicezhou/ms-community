package com.neo.mcframe.test;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neo.dubbo.frame.bean.User;
import com.neo.mcframe.dao.UserMapper;

@SpringBootTest
class TestGetDataFromDB {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserMapper userDao;
	
	@Test
	void test() {
		
		User user = userDao.selectById(1);
		logger.debug("==== user account is "+user.getAccount());
	}

}
