package org.example.mscreditmanager.controller;

import lombok.AllArgsConstructor;
import org.example.mscreditmanager.model.request.CustomerRequest;
import org.example.mscreditmanager.model.response.CustomerResponse;
import org.example.mscreditmanager.service.abstraction.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@AllArgsConstructor
@RequestMapping("v1/customers/")
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createCustomer(@RequestBody CustomerRequest customerRequest) {
        customerService.createCustomer(customerRequest);
    }
    @GetMapping()
    public CustomerResponse getCustomer(@RequestParam String pin) {
        return customerService.getCustomer(pin);
    }
}
