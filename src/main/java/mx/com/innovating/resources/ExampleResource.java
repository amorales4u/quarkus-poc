package mx.com.innovating.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import mx.com.innovating.services.ExampleService;

@Path("/hello")
public class ExampleResource {

    private final ExampleService service;

    public ExampleResource(ExampleService service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return  service.hello();
    }
}
