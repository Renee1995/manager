package com.manager.common.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manager.common.filter.SessionFilter;

/**
 * 项目名称：store-renee
 * 类名称：FilterConfig
 * 类描述：
 * 创建人：zhangwanxin
 * 创建时间： 2018年9月10日 下午3:19:12
 */
@Configuration
public class FilterConfig {
	@Bean
	@SuppressWarnings({ "rawtypes", "unchecked" })
    public FilterRegistrationBean sessionFilterRegister() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
        //注入过滤器
        registration.setFilter(new SessionFilter());
        //拦截规则
        registration.addUrlPatterns("/*");
        //过滤器名称
        registration.setName("sessionFilter");
        /* 过滤器顺序 */
        registration.setOrder(FilterRegistrationBean.LOWEST_PRECEDENCE);
        return registration;
    }

}
