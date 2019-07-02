package thing.ribbon.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import thing.ribbon.server.service.HelloHystrixService;

@RestController
public class HelloController {

    @Autowired
    HelloHystrixService helloHystrixService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloHystrixService.hello(name);
    }

    // @GetMapping("/hello")
    // public String hello(@RequestParam String name){
    //     return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    // }

}
