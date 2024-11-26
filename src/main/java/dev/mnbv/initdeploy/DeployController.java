package dev.mnbv.initdeploy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeployController {

    @GetMapping("/")
    public String index () {
        return "/index";
    }

    @GetMapping("/api")
    @ResponseBody
    public String api () {
        return "Deployment was successful.";
    }
}
