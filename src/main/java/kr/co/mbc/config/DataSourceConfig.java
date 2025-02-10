package kr.co.mbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:db/mysql.properties") // MySQL 설정 파일
//@PropertySource("classpath:db/oracle.properties")  // Oracle 설정 파일
public class DataSourceConfig {

	@Value("${db.url}")
	private String dbUrl;
	
	@Value("${db.driver}")
	private String dbDriver;
	
	@Value("${db.username}")
	private String dbUsername;
	
	@Value("${db.password}")
	private String dbPassword;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(dbUrl);
        dataSource.setDriverClassName(dbDriver);
        dataSource.setUsername(dbUsername);
        dataSource.setPassword(dbPassword);
        return dataSource;
	}
}