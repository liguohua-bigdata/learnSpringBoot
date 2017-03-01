package com.example.c007;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liguohua on 01/03/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
public class ApplicationTests {
    @Autowired
    private Task task;
    @Test
    public void test() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }
}