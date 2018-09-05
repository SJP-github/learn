package com.sjp.datavalidat.controller;

import com.alibaba.fastjson.JSON;
import com.sjp.datavalidat.bean.User;
import jdk.nashorn.internal.objects.NativeJSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @GetMapping("/user")
    public String valida(@Valid User user) {
        String s = JSON.toJSONString(user);
        System.out.println("test success");
        return s;
    }
}
