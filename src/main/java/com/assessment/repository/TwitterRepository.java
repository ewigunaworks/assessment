/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assessment.repository;

import com.assessment.model.Tweets;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erwin.wiguna_gue
 */
@Repository
public interface TwitterRepository extends JpaRepository<Tweets, Long>{
    List<Tweets> findAll();
    List<Tweets> findAllByOrderByTweetDateAtDesc();
    List<Tweets> findByTweetId(String id);
    Tweets findFirstByTweetId(String id);
    Integer countByTweetId(String id);
    
}
