package com.yuapt.service1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jimmy on 16/12/27.
 */
@RestController
public class HiController {


    private static final Log log = LogFactory.getLog(HiController.class);

    @RequestMapping("/hello")
    public String hi() throws Exception {
        log.info("helloservice");
        Thread.sleep(100L);
        return "helloservice";
    }

}
