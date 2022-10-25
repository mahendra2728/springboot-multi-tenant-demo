package com.pm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.pm.demo")
@EntityScan(basePackages = "com.pm.demo")
@EnableJpaRepositories(basePackages = "com.pm.demo")
public class SpringbootMultiTenantDemoApplication {

  @GetMapping("/welcome")
  public String print(){
    return "Hello Good Morning";
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMultiTenantDemoApplication.class, args);
  }
}
