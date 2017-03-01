package com.example.c004;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liguohua on 01/03/2017.
 */
@Controller
public class TestGlobalError {
    @RequestMapping("/c004/err")
    public String hello() throws Exception {
        throw new Exception("发生错误");
    }
}
