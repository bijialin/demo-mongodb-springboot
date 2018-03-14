package com.nickbi.mongodb.repository;

import com.nickbi.mongodb.entity.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author nickbi
 * @date 2018-03-14
 */
public interface DemoDao extends MongoRepository<Demo, Long> {

    public Demo findByDemoName(String demoName);

    public List<Demo> findByDemo(String demo);
}
