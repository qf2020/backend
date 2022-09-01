package com.example.eurakeserverconsume.controller;



import com.example.eurakeserverconsume.res.ERROR;
import com.example.eurakeserverconsume.res.SUCCESS;
import com.example.eurakeserverconsume.service.ConsumeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/client")

public class ClientController {
    @Autowired
    private ConsumeService consumeService;

    @PostMapping("/register")
   // @HystrixCommand(fallbackMethod = "error_code")
    @CrossOrigin
    public Object register(@RequestBody Object client){
        if(consumeService.register(client)){
            return new SUCCESS("");
        }else{
            return new ERROR("注册失败","");
        }
    }
    public Object error_code(@RequestBody Object client){
        Map<String,Object> tp = new HashMap<>();
        tp.put("false","服务器异常");
        return tp;
    }

    @PostMapping("/login")
    @CrossOrigin
    public Object login(@RequestBody Object loginRequest){
        return new SUCCESS(consumeService.login(loginRequest));
    }

    @PostMapping("/changePassword")
    @CrossOrigin
    public Object changePassword(@RequestBody Map<String, Object> changePasswordRequest){
        if(consumeService.changePassword(changePasswordRequest)){
            return new SUCCESS("");
        }else{
            return new ERROR("修改密码失败","");
        }
    }
}
