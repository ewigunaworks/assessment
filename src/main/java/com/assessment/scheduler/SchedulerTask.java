/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.scheduler;

import com.assessment.service.TwitterTimelineService;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author erwin.wiguna_gue
 */
@Component
public class SchedulerTask {
    
    @Autowired
    private TwitterTimelineService twitterTimelineService;
    
    @Scheduled(fixedRateString = "${fixed.rate.timer}")
    public void scheduleTaskWithFixedRate() {
        twitterTimelineService.getHomeTimeline();
    }
}
