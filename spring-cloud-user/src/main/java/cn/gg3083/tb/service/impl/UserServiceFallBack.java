package cn.gg3083.tb.service.impl;

import cn.gg3083.tb.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFallBack implements UserService {

    @Override
    public String get(String name) {
        return "hi," + name + "：服务器GG了";
    }
}
