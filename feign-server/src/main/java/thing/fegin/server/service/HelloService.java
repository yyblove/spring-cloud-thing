package thing.fegin.server.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import thing.fegin.server.service.fallback.HelloServiceHystrix;

// @FeignClient("eureka-client")
@FeignClient(value = "eureka-client", fallback = HelloServiceHystrix.class)
public interface HelloService {

    @GetMapping("/hello")
    String sayHelloFromClientOne(@RequestParam(defaultValue = "feign") String name);

}
