package xyz.stg.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shitiangao on 2016/10/31.
 */
@SpringBootApplication
@RefreshScope
@RestController
public class Client {

    @Value("${hello.answer}")
    String foo;

    @RequestMapping("/hello")
    public String hello() {
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}
