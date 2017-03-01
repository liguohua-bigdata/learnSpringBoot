package com.example.c005;

import com.example.c005.jsonerror.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liguohua on 01/03/2017.
 */
@Controller
public class TestGloBalErrorJson {
    // TODO:  http://localhost:8080/c005/err/json
    @RequestMapping("/c005/err/json")
    public String json() throws MyException {
        throw new MyException("发生错误2");
    }
}
