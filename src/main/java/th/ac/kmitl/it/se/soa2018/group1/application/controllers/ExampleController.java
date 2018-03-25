package th.ac.kmitl.it.se.soa2018.group1.application.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/example")
    public String index() {
        return "<H1> This is Example Page </H1>";
    }

}
