package com.solar.mars.controller;


import com.solar.mars.Model.PersonModel;
import com.solar.mars.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    private final AccountService accountService;

    public BasicController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/message")
    public String retrieveDetailsForCourse() {

        return "Hello Welcome to my new application";
    }

    @PostMapping("/insertData")
    public void insertData(@RequestBody PersonModel personModel) {
        accountService.accountMethod(personModel);
    }


}
