package com.java.javainuse.configuration;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {

	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://localhost/test?createDatabaseIfNotExist=true&autoReconnect=true&useSSL=false");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("root");
		return dataSourceBuilder.build();
	}
}
