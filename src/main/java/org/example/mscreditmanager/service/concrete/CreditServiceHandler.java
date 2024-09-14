package org.example.mscreditmanager.service.concrete;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mscreditmanager.client.CreditConveyorClient;
import org.example.mscreditmanager.dao.repository.CreditRepository;
import org.example.mscreditmanager.dao.repository.OfferRepository;
import org.example.mscreditmanager.exception.NotFoundException;
import org.example.mscreditmanager.mapper.CreditMapper;
import org.example.mscreditmanager.model.client.ConveyorResponseDto;
import org.example.mscreditmanager.model.enums.ExceptionConstants;
import org.example.mscreditmanager.model.response.CreditResponse;
import org.example.mscreditmanager.service.abstraction.CreditService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.mscreditmanager.mapper.CreditMapper.CREDIT_MAPPER;
import static org.example.mscreditmanager.model.enums.ExceptionConstants.CREDIT_NOT_FOUND;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreditServiceHandler implements CreditService {
    private final CreditRepository creditRepository;
    private final CreditConveyorClient creditConveyorClient;
    private final OfferRepository offerRepository;
    @Override
    public CreditResponse getCredit(Long id) {
        var credit = creditRepository.findById(id).orElseThrow(()->new NotFoundException(CREDIT_NOT_FOUND.getMessage(),CREDIT_NOT_FOUND.getCode()));
        var creditConveyor = creditConveyorClient.getOffers(CREDIT_MAPPER.buildConveyorRequest(credit));
        var products = creditConveyor.stream().flatMap(conveyor->conveyor.getProducts().stream()).toList();
        var statusHistories = credit.getStatusHistories();

        return CREDIT_MAPPER.buildCreditResponse(credit);
    }
}
