package samuel.b.springbootapitemplate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hellos")
public class HelloController {

    @GetMapping
    public String getHello(){
        return "hello";
    }
}
