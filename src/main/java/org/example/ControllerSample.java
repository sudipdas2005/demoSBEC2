package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSample {
    @GetMapping ("/employees/{id}")
    String getCustomer(@PathVariable String id) {
        return "hello from " + id;
    }
}
