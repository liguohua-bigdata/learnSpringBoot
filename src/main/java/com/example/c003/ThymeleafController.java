package com.example.c003;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liguohua on 01/03/2017.
 */
@Controller
public class ThymeleafController {
    //TODO:  http://localhost:8080/c003/index
    @RequestMapping("/c003/index")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "这里是themleaf中产生的内容！！");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}