package org.example.mscreditmanager.model.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private BigDecimal amount;

    private BigDecimal monthlyPayment;

    private BigDecimal interest;

    private int term;

    private Long productId;
}
