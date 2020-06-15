package com.neo.mcframe.serviceimpl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.neo.dubbo.frame.bean.User;
import com.neo.dubbo.interfaces.UserService;
import com.neo.mcframe.dao.UserMapper;

@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService<User> {
	
	@Autowired
	UserMapper userDao;
	
	@Override
	public boolean checkUserExists(Integer userId) {
		
		User user = userDao.selectById(userId);
		
		if(user == null) {
			return false;			
		}
		return true;
	}
}
