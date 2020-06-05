package com.neo.mcframe.dict;

public enum StateCode {

	success(200,null),fail(400,null);
	
	private Integer code;
	private String msg;
	StateCode(Integer code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	Integer rCode() {
		return this.code;
	}
	
	String rMsg() {
		return this.msg;
	}
	
	void wMsg(String msg) {
		this.msg = msg;
	}
}
