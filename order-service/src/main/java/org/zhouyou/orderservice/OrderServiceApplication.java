package org.zhouyou.orderservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class OrderServiceApplication {

    private static Logger logger=LoggerFactory.getLogger(OrderServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        return new ResponseEntity<String>("hello order service!", HttpStatus.OK);
    }
    @RequestMapping(value = "/product/hello",method = RequestMethod.GET)
    public String productHello() {
        logger.info("order-service calling product-service!");
        return restTemplate.getForEntity("http://PRODUCT-SERVICE/hello", String.class).getBody();
    }
}
