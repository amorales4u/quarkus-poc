package mx.com.innovating.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExampleService {


    public String hello() {
        return "Hello from Quarkus REST";
    }
}
