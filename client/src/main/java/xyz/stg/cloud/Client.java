package xyz.stg.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shitiangao on 2016/10/31.
 */
@SpringBootApplication
@RestController
public class Client {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hello")
    public String hello() {
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}