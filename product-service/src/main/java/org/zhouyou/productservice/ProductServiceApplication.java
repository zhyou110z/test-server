package org.zhouyou.productservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ProductServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
    private static Logger logger=LoggerFactory.getLogger(ProductServiceApplication.class);


    @RequestMapping(value="hello",method = RequestMethod.GET)
    public ResponseEntity<String> hello(){
        logger.info("called by product-service");
        return new ResponseEntity<>("hello product service!",HttpStatus.OK);
    }

}
