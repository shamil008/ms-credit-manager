package org.example.mscreditmanager.controller;

import lombok.RequiredArgsConstructor;
import org.example.mscreditmanager.model.response.CreditResponse;
import org.example.mscreditmanager.service.abstraction.CreditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/credits/")
public class CreditController {
    private final CreditService creditService;

    @GetMapping("{id}")
    public CreditResponse getCredit(@PathVariable Long id ) {
        return creditService.getCredit(id);
    }
}
