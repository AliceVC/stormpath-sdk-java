/*
 * Copyright 2017 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.tutorial.config;

import com.stormpath.spring.config.EnableStormpathWebSecurity;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.stormpath.spring.config.StormpathWebSecurityConfigurer.stormpath;

/**
 * @since 1.3.0
 */
@Configuration
@ComponentScan("com.stormpath.tutorial")
@PropertySource("classpath:application.properties")
@EnableStormpathWebSecurity
public class SpringSecurityWebAppConfig extends WebSecurityConfigurerAdapter {

    // This configuration ensures that the static index.html is served
    // without requiring authentication. Every other custom path would
    // require authentication.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .apply(stormpath()).and()
            .authorizeRequests()
            .antMatchers("/static/index.html").permitAll();
    }
}