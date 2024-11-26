package dev.mnbv.initdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployController {

    @GetMapping("/")
    public String hello () {
        return "Deployment was successful.";
    }
}
