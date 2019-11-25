package com.alit.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Import(com.alit.study.springboot.ImportAutoConfiguration.class)
@ComponentScan(value = "com.alit.study.springboot", excludeFilters = {
    @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
    @Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

@EnableJpaRepositories(basePackages = { "com.alit.study.springboot.repository" })
@EntityScan("com.alit.study.springboot.entity")
@Slf4j
public class Application {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    SpringApplication.run(Application.class, args);
    long end = System.currentTimeMillis();
    log.info("共使用了:" + (end - start) + "ms");
  }
}
