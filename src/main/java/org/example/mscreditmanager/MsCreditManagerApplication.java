package org.example.mscreditmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsCreditManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCreditManagerApplication.class, args);
    }

}
