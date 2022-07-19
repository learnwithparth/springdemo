package in.myorg.mypackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/")
    public String welcomeMessage(){
        return "Welcome to the world of Srping Boot!!!";
    }

    @GetMapping("/getDate")
    public Date getDate(){
        return new Date();
    }
}
