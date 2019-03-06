package com.business.timesheetservice.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Posted from Mar 06, 2019, 16:11 16
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
@RestController
public class TimeSheetController {
    @GetMapping("/employess")
    private static void getEmployees() {
        final String uri = "http://localhost:8080/employees";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);

        System.out.println(result);
    }

    @GetMapping("/getsomething")
    private String getSomething() {
        return "Something";
    }
}
