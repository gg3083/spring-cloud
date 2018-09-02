package cn.gg3083.tb.service;

import cn.gg3083.tb.service.impl.UserServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient( value= "service",fallback = UserServiceFallBack.class )
public interface UserService {

    @RequestMapping(value = "get/{name}")
    String get(@PathVariable(value = "name") String name);
}
