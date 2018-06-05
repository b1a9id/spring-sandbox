package com.sandbox.spring.model.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableJpaAuditing
public class WebMvcConfig extends WebMvcConfigurerAdapter {
}
