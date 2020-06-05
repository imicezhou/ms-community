package com.neo.mcframe.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neo.mcframe.bean.User;
import com.neo.mcframe.dao.UserMapper;
import com.neo.mcframe.dict.RespMsg;

@RestController
public class UserController {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	UserMapper userDao;
	
	
	@GetMapping("/user")
	@ResponseBody
	public RespMsg checkUserExists(
		@RequestParam(name = "account")	String account,
		@RequestParam(name = "password") String password
			) {
		
		RespMsg rsp = new RespMsg();
		
		Map<String,Object> identity = new HashMap<>();
		identity.put("account", account);
		identity.put("password", password);
		
		List<User> rs = userDao.selectByMap(identity);
		if(rs.size()>0) {
			log.info("=======找到用户=====");
			rsp.setCode(200);
			rsp.setMsg("find it");
			return rsp;
		}
		
		log.info("=======没有找到用户=====");
		rsp.setCode(400);
		rsp.setMsg("not find it");
		return rsp;
	}
}
