package com.neo.dubbo.interfaces;

public interface UserService<T> {

	boolean checkUserExists(Integer userId);
}
