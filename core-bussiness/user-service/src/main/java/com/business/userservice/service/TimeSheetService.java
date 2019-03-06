package com.business.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Posted from Mar 06, 2019, 17:00 17
 *
 * @Author viquynh (vi.quynh.31598@gmail.com)
 */
@RestController
public class TimeSheetService {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/calltimesheet")
    public void getEmployee() throws RestClientException, IOException {
        ServiceInstance serviceInstance = loadBalancer.choose("timesheet-service");
        RestTemplate restTemplate = new RestTemplate();
        System.out.println(restTemplate.getForObject(serviceInstance.getUri() + "/getsomething", String.class));
    }


//    @GetMapping("/calltimesheet")
//    private static void getSomething(){
////        final String uri = "http://localhost:8082/getsomething";
//    final String uri = "http://timesheet-service/getsomething";
//
//    RestTemplate restTemplate = new RestTemplate();
//    String result = restTemplate.getForObject(uri, String.class);
//
//    System.out.println(result);
//    }
}
