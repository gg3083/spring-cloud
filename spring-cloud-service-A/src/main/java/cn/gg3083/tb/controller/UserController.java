package cn.gg3083.tb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("get/{name}")
    public String get(@PathVariable(value = "name") String name){
        return  name + "来了，端口号为:" + port;
    }

}
