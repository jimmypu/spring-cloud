package com.yuapt.zipkin;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 16/5/17.
 */

@RequestMapping("/test")
@RestController
public class HelloController {



    @Value("${qiniu.url}")
    private String driverClassName;
    @Value("${upload.url}")
    private String driverClassName1;



    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() {
        System.out.println("driverClassName=" + driverClassName);
        System.out.println("driverClassName1=" + driverClassName1);
        return new String("hello world!");
    }
}
