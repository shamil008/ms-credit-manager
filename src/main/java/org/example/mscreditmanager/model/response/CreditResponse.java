package org.example.mscreditmanager.model.response;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.mscreditmanager.model.enums.CreditStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditResponse {
    private Long id;

    private int term;

    private BigDecimal interest;

    private BigDecimal monthlyPayment;

    private  BigDecimal amount;

    private  BigDecimal requestedAmount;

    private CreditStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
