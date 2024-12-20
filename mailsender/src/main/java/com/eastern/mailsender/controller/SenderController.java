package com.eastern.mailsender.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
public class SenderController {
    @GetMapping("/send")
    public String send(){
        return "mail sended";
    }
    @GetMapping("/sendMs")
    public String sendMs(){
        return "sending to ms";
    }
}
