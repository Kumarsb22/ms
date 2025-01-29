package com.kumar.hibernate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

//@Configuration
public class HibernateConfi {

//	@Bean
//	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
//		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource);
//		sessionFactoryBean.setPackagesToScan("com.kumar.hibernate.entity");
//
//		Properties hibernateProperties = new Properties();
//		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//		hibernateProperties.put("hibernate.show_sql", "true");
//		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
//
//		sessionFactoryBean.setHibernateProperties(hibernateProperties);
//		return sessionFactoryBean;
//	}
}
