/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment;

import com.assessment.model.Tweets;
import com.assessment.repository.TwitterRepository;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

/**
 *
 * @author erwin.wiguna_gue
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TwitterRepositoryTest {
    @Autowired
    private TestEntityManager testEntityManager;
    
    @Autowired
    private TwitterRepository twitterRepository;
    
    @Test
    public void whenFindAllByOrderByTweetDateAtDesc_thenReturnTweetsList() {
        List<Tweets> tweets = twitterRepository.findFirst20ByOrderByTweetDateAtDesc();
        assertThat(tweets).hasSizeGreaterThan(10);
    }
    
    @Test
    public void whenFindFirstByTweetId_thenReturnTweets() {
        String id = "1128358947772145672";
        Tweets tweets = twitterRepository.findFirstByTweetId(id);
        assertThat(tweets).isNull();
    }
}
