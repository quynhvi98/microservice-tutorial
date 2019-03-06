package com.business.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Posted from Mar 06, 2019, 16:59 16
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
@RestController
@RibbonClient(name = "admin-user")
public class AdminService {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/calladmin")
    private void getDog() {
        final String uri = "http://admin-user/ahihi";

        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
}
