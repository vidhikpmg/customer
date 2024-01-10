package com.acceval.integration.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.ConsoleAppender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {
	@Value("${log.file.path}") // Inject path from properties file
	private String logFilePath;// = "D:\\IOCL\\producer\\iocl_soap_log"

	@Bean
	public Logger logger() {
		return LogManager.getLogger(getClass().getName());
	}

	@Bean
	public LoggerContext loggerContext() {
//		CreateLogDirectory cd = new CreateLogDirectory();
//		String destination_path = cd.createFolderIfNotExists(logFilePath);

		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();

		builder.setStatusLevel(Level.DEBUG);
		builder.setConfigurationName("ProgrammaticConfig");

		// Define appenders, layouts, and loggers here

		builder.add(builder.newRootLogger(Level.INFO));

		builder.add(builder.newAppender("File", "File").addAttribute("fileName", logFilePath)
				.add(builder.newLayout("PatternLayout").addAttribute("pattern",
						"%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n")));

		builder.add(builder.newAppender("Console", "Console").addAttribute("target", ConsoleAppender.Target.SYSTEM_OUT)
				.add(builder.newLayout("PatternLayout").addAttribute("pattern",
						"%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n")));

		BuiltConfiguration configuration = builder.build();
		LoggerContext context = Configurator.initialize(configuration);

		return context;
	}
}
