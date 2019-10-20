/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

/**
 *
 * @author erwin.wiguna_gue
 */

@Service
public class TwitterTimelineService {
    @Autowired
    private Twitter twitter;
    
    public List<Tweet> getHomeTimeline() {
        List<Tweet> tweets = twitter.timelineOperations().getHomeTimeline();
        return tweets;
    }
}
