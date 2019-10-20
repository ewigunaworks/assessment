/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.service;

import com.assessment.model.Tweets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
    
    public List<Tweets> getHomeTimeline() {
        List<Tweet> tweets = twitter.timelineOperations().getHomeTimeline();
        System.out.println("SINIIII");
        List<Tweets> newTweets = new ArrayList<Tweets>();
        
        System.out.println(tweets.size());
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        SimpleDateFormat parser = new SimpleDateFormat();
        for(Tweet tw : tweets) {
            Tweets twts = new Tweets();
            twts.setTweetDateAt(tw.getCreatedAt());
            twts.setTweet(tw.getText());
            twts.setName(tw.getUser().getName());
            twts.setScreenName(tw.getUser().getScreenName());
            
            newTweets.add(twts);
        }
        
        return newTweets;
    }
}
