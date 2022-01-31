package com.example.MTGapiproject.Controllers;

import com.example.MTGapiproject.Entities.testEntity;
import com.example.MTGapiproject.Payloads.requests.testCreatePayload;
import com.example.MTGapiproject.Services.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/test_entity")
public class testController {
    @Autowired
    private testService service;

    //    http://127.0.0.1:8080/test_entity/test
    @GetMapping(value = "/test")
    public String test() {
        return "hello, world!";
    }

    @GetMapping(value = "/test/{name}")
    public String testName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/test/{name}/{age}")
    public String testNameAge(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello %s, you are %d years old", name, age);
    }

    @GetMapping(value = "/*")
    public List<testEntity> all() {
        return this.service.all();
    }

    @GetMapping(value = "/{id}")
    public testEntity findById (@PathVariable Long id) {
        return this.service.findById(id);
    }
    //Creating tests
    @PostMapping
    public void save(@Valid @RequestBody testCreatePayload test) {
        this.service.create(test);
    }
}
