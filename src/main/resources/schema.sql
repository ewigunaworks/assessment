/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  erwin.wiguna
 * Created: Oct 21, 2019
 */
CREATE TABLE public.tweets (
    id serial NOT NULL,
    tweet_id varchar null,
    "name" varchar NULL,
    tweet varchar NULL,
    screen_name varchar NULL,
    tweet_date_at timestamp NULL,
    created_at timestamp NULL,
    updated_at timestamp NULL,
    created_by int4 NULL,
    updated_by int4 NULL
);
