package com.nickbi.mongodb;

import com.nickbi.mongodb.entity.Demo;
import com.nickbi.mongodb.repository.DemoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongodbApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void contextLoads() {
    }


    @Test
    public void saveDemo() {
        Demo demo = new Demo();
        demo.setDemo("first");
        demo.setDemoName("1sDemo");
        demo.setId(1001L);
        demoDao.save(demo);
    }
}
