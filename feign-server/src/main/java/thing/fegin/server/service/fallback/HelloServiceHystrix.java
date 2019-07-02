package thing.fegin.server.service.fallback;

import org.springframework.stereotype.Component;
import thing.fegin.server.service.HelloService;

@Component
public class HelloServiceHystrix implements HelloService {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "Hystrix fallback " + name;
    }
}
