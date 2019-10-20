/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;

/**
 *
 * @author erwin.wiguna
 */
@Service
public class TwitterService {
    @Autowired
    private Twitter twitter;
    
    public List<String> getLatestTweet() {
        List<String> tweets = new ArrayList<>();
        try {
            ResponseList<Status> homeTimeline = twitter.getHomeTimeline();
            for(Status status : homeTimeline) {
                tweets.add(status.getText());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tweets;
    }
}
