package cn.gg3083.tb.controller;

import cn.gg3083.tb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("get/{name}")
    public String get(@PathVariable(value = "name") String name ) {
        return userService.get( name );
    }

}

