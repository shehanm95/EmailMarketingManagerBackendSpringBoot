package com.eastern.emaildatakeeper.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class EmailController {

    private final String  SENDER_SERVICE = "http://mail-sender";
    private final RestTemplate restTemplate;

    @GetMapping("/data")
    public String get(){
        return "working";
    }

    @GetMapping("/data/send")
    public String getFromSender(){
        ResponseEntity<String> response = restTemplate.getForEntity(SENDER_SERVICE + "/sender/sendMs",String.class);
        String newRes = "Got From Api : " +response.getBody();
        return newRes;
    }

}
