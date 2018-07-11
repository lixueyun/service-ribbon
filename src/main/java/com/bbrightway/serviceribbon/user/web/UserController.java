package com.bbrightway.serviceribbon.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName  UserController
 * @Description  TODO
 * @Date  2018/7/11 14:19
 * @author  lixueyun
 * @version  V1.0
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/users")
    public String getUserList(){
        return restTemplate.getForObject("http://user-service/users",String.class);
    }
}
