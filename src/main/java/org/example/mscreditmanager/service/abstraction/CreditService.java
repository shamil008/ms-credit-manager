package org.example.mscreditmanager.service.abstraction;

import org.example.mscreditmanager.model.response.CreditResponse;

public interface CreditService {
    CreditResponse getCredit(Long id);
}
