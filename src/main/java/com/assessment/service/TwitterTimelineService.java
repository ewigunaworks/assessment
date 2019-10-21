/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.service;

import com.assessment.model.Tweets;
import com.assessment.repository.TwitterRepository;
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
    
    @Autowired
    private TwitterRepository twitterRepository;
    
    public List<Tweets> getHomeTimeline() {
        List<Tweet> tweets = twitter.timelineOperations().getHomeTimeline();
        
//        List<Tweets> newTweets = new ArrayList<Tweets>();
        
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//        SimpleDateFormat parser = new SimpleDateFormat();
        for(Tweet tw : tweets) {
            
            Tweets isExist = twitterRepository.findFirstByTweetId(tw.getIdStr());
            if(isExist == null) {
                Tweets twts = new Tweets();
                twts.setTweetId(tw.getIdStr());
                twts.setTweetDateAt(tw.getCreatedAt());
                twts.setTweet(tw.getText());
                twts.setName(tw.getUser().getName());
                twts.setScreenName(tw.getUser().getScreenName());
                twts.setCreatedAt(new Date());
                twts.setUpdatedAt(new Date());
                twts.setCreatedBy(1);
                twts.setUpdatedBy(1);
                
                twitterRepository.save(twts);
            }
        }
        
        List<Tweets> newTweets = twitterRepository.findAllByOrderByTweetDateAtDesc();
        
        return newTweets;
    }
}
