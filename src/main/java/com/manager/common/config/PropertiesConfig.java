package com.manager.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 项目名称：store-renee
 * 类名称：PropertiesConfig
 * 类描述：
 * 创建人：zhangwanxin
 * 创建时间： 2018年9月10日 下午4:04:00
 */
@Configuration
@PropertySource("classpath:application.properties")
public class PropertiesConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
