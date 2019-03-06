package com.business.adminservice.controller;

import com.business.adminservice.model.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Posted from Mar 06, 2019, 15:53 15
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
@RestController
public class AdminController {
    @RequestMapping("/ahihi")
    Dog getDog() {
        return new Dog("gaau gaau");
    }

    @GetMapping("/employees")
    private void getEmployees() {
        final String uri = "http://localhost:8080/employees";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
    }
}
