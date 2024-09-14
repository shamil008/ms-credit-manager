package org.example.mscreditmanager.service.abstraction;

import org.example.mscreditmanager.model.request.CustomerRequest;
import org.example.mscreditmanager.model.response.CustomerResponse;

public interface CustomerService {
    void createCustomer(CustomerRequest customerRequest);
    CustomerResponse getCustomer(String pin);
}
