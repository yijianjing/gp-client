package com.gupaoedu.ssvip.client.controller;

import com.gupaoedu.ssivp.server.GpReference;
import com.gupaoedu.ssivp.server.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GpReference
    private IOrderService orderService;

    @GetMapping("/test")
    public String test(){
        String s = orderService.queryOrderList();
        return s;
    }
}
