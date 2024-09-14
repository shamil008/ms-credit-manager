package org.example.mscreditmanager.service.concrete;

import lombok.AllArgsConstructor;
import org.example.mscreditmanager.dao.repository.CustomerRepository;
import org.example.mscreditmanager.exception.NotFoundException;
import org.example.mscreditmanager.mapper.CustomerMapper;
import org.example.mscreditmanager.model.enums.ExceptionConstants;
import org.example.mscreditmanager.model.request.CustomerRequest;
import org.example.mscreditmanager.model.response.CustomerResponse;
import org.example.mscreditmanager.service.abstraction.CustomerService;
import org.springframework.stereotype.Service;

import static org.example.mscreditmanager.mapper.CustomerMapper.CUSTOMER_MAPPER;
import static org.example.mscreditmanager.model.enums.ExceptionConstants.CUSTOMER_NOT_FOUND;

@Service
@AllArgsConstructor
public class CustomerServiceHandler implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public void createCustomer(CustomerRequest customerRequest) {
        customerRepository.save(CUSTOMER_MAPPER.buildCustomerEntity(customerRequest));
    }

    @Override
    public CustomerResponse getCustomer(String pin) {
        var customer = customerRepository.findByPin(pin).orElseThrow(()->new NotFoundException(CUSTOMER_NOT_FOUND.getMessage(),CUSTOMER_NOT_FOUND.getCode()));
        return CUSTOMER_MAPPER.buildCustomerResponse(customer);
    }
}
