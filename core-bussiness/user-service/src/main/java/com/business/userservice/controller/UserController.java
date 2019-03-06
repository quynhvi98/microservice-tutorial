package com.business.userservice.controller;

import com.business.userservice.model.Customer;
import com.business.userservice.model.Greet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Posted from Mar 06, 2019, 10:47 10
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
@RestController
public class UserController {
    @RequestMapping("/")
    Greet greet() {
        return new Greet("Hello Fucking World!");
    }

    @RequestMapping(value = "/employees")
    public Customer getAllEmployees() {
        Customer employees = new Customer();

        Customer empOne = new Customer("injava@gmail.com");

        return empOne;
    }
}
