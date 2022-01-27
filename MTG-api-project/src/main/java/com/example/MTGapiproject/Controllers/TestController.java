package com.example.MTGapiproject.Controllers;

import com.example.MTGapiproject.Entities.TestEntity;
import com.example.MTGapiproject.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test_entity")
public class TestController {
    @Autowired
    private TestService service;

    @GetMapping(value = "/*")
    public List<TestEntity> all() {
        return this.service.all();
    }

    @GetMapping(value = "/{id}")
    public TestEntity findById (@PathVariable Long id) {
        return this.service.findById(id);
    }
}
