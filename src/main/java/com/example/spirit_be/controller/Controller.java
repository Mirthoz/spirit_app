package com.example.spirit_be.controller;

import com.example.spirit_be.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final TestService testService;

    public Controller(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    String all() {
        return "Hi there!";
    }

    @GetMapping("/record/{counter}")
    public Integer testRecord(@PathVariable Integer counter){
        return testService.testRecordInDB(counter);
    }

    @GetMapping("/record")
    public Integer testRecord(){
        return testService.testRecordInDB(123);
    }

    @GetMapping("/get")
    public String getAll(){return testService.getAll();
    }
}
