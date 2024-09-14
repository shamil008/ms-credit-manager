package org.example.mscreditmanager.model.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConveyorRequest {
    private BigDecimal amount;

    private BigDecimal monthlyPayment;

    private BigDecimal interest;

    private int term;
}
