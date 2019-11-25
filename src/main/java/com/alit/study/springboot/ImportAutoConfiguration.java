package com.alit.study.springboot;

import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.web.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import({
  // web server
  EmbeddedServletContainerAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.EmbeddedTomcat.class,
  // Property
  PropertyPlaceholderAutoConfiguration.class,
  // json
  JacksonAutoConfiguration.class,
  // websocket
  WebSocketAutoConfiguration.class,
  // spring mvc
  DispatcherServletAutoConfiguration.class, ErrorMvcAutoConfiguration.class, WebMvcAutoConfiguration.class,
  // aop
  AopAutoConfiguration.class,
  // data source
  DataSourceAutoConfiguration.class,
  // JPA
  // JpaRepositoriesAutoConfiguration.class,
  // hibenate
  HibernateJpaAutoConfiguration.class,
  // jta
  JtaAutoConfiguration.class,
  //
  ConfigurationPropertiesAutoConfiguration.class,
  //
  PersistenceExceptionTranslationAutoConfiguration.class,
  //
  ValidationAutoConfiguration.class,
  //
  DataSourceTransactionManagerAutoConfiguration.class,
  //
  TransactionAutoConfiguration.class,
  //
  HttpMessageConvertersAutoConfiguration.class,
  //
  SpringDataWebAutoConfiguration.class,
  //
  ProjectInfoAutoConfiguration.class,
  //
  JdbcTemplateAutoConfiguration.class,
  //
  HttpEncodingAutoConfiguration.class,
  //
  MultipartAutoConfiguration.class,
  //
  ServerPropertiesAutoConfiguration.class,
  //
  WebClientAutoConfiguration.class,
  // spring-security
  SecurityAutoConfiguration.class, SecurityFilterAutoConfiguration.class, })
public class ImportAutoConfiguration {

}
