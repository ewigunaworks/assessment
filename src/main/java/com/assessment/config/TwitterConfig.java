/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

/**
 *
 * @author erwin.wiguna
 */
@Configuration
public class TwitterConfig {
    @Value("${spring.social.twitter.appId}")
    private String consumerKey;
    
    @Value("${spring.social.twitter.appSecret}")
    private String consumerSecret;
    
    @Value("${twitter.access.token}")
    private String accessToken;
    
    @Value("${twitter.access.token.secret}")
    private String accessTokenSecret;
    
    @Bean
    TwitterTemplate getTwitterTemplate() {
        return new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
    }
}
