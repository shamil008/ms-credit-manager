package org.example.mscreditmanager.client;

import org.example.mscreditmanager.client.decoder.CustomErrorDecoder;
import org.example.mscreditmanager.model.client.ConveyorRequest;
import org.example.mscreditmanager.model.client.ConveyorResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(
        name = "ms-credit-conveyor",
        path = "/v1/credit-conveyor/offers",
        url = "${client.urls.ms-credit-conveyor}",
        configuration = CustomErrorDecoder.class
)
public interface CreditConveyorClient {
    @PostMapping()
    public List<ConveyorResponseDto> getOffers(@RequestBody ConveyorRequest conveyorRequest);
}
