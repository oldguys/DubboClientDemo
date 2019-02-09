package com.example.dubbo.controllers;/**
 * Created by Administrator on 2018/11/14 0014.
 */

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.services.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ren
 * @CreateTime: 2018-11-2018/11/14 0014 21:39
 */
@RestController
public class TestClientController {


    @Reference
    private TestService testService;

    @GetMapping({"", "client"})
    public String test() {

        return testService.getMessage("-TestClientController");
    }
}
