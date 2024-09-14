package org.example.mscreditmanager.service.concrete;

import lombok.RequiredArgsConstructor;
import org.example.mscreditmanager.dao.repository.OfferRepository;
import org.example.mscreditmanager.service.abstraction.OfferService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfferServiceHandler implements OfferService {
    private final OfferRepository offerRepository;
    @Override
    public void getOffers(Long id) {
        var offers = offerRepository.findById(id);
        offers.stream()
                .map(i -> i.getAmount().compareTo(BigDecimal.valueOf(300))< 0 ? i :300 )
                .collect(Collectors.toList());

    }
}
