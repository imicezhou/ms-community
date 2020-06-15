package com.neo.mcframe.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * 多数据源
 * @author 15105
 *
 */
@Configuration
@MapperScan(basePackages = {"com.neo.mcframe.dao"})
public class MybatisPlusConfig {
	
	
}
