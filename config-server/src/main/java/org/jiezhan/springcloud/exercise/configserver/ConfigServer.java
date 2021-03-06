package org.jiezhan.springcloud.exercise.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

    // add some info
    public static void main(String[] arguments) {
        SpringApplication.run(ConfigServer.class, arguments);
    }


}
