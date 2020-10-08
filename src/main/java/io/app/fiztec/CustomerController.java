package io.app.fiztec;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("customer/v1")
public class CustomerController {

    @Get("/")
    public String getCustomer(){
        return "Hello Customer";
    }
}
