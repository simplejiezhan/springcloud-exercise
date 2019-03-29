package org.jiezhan.springcloud.exercise.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${system.username}")
    private String username;

    @Value("${system.password}")
    private String password;

    @RequestMapping("/message")
    public String getMessage() {
        return new StringBuilder().append(username).append(password).toString();
    }

}
