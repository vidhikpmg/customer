package com.acceval.integration.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement

@EnableJpaRepositories(entityManagerFactoryRef = "materialEntityManagerFactory", basePackages = {
		"com.acceval.integration.material.repo" })
public class OtherMasterConfig {

	@Bean(name = "postgresDataSource")
	@ConfigurationProperties(prefix = "spring.db2.datasource")
	DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "materialEntityManagerFactory")
	LocalContainerEntityManagerFactoryBean entityManagerFactoryMaterial(EntityManagerFactoryBuilder builder,

			@Qualifier("postgresDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.acceval.integration.material.entity")
				.persistenceUnit("master_data.pricing_tool").build();
	}
	
	
	@Bean(name = "transactionManager2")
    PlatformTransactionManager transactionManager2(
            @Qualifier("materialEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        
        return new JpaTransactionManager(entityManagerFactory);
    }

}
