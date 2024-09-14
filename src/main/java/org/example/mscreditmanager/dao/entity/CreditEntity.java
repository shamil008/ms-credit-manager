package org.example.mscreditmanager.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.mscreditmanager.model.enums.CreditStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "credits")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int term;

    private BigDecimal interest;

    private BigDecimal monthlyPayment;

    private  BigDecimal amount;

    private  BigDecimal requestedAmount;

    @Enumerated(EnumType.STRING)
    private CreditStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private CustomerEntity customer;

    @OneToMany(mappedBy = "credit")
    @ToString.Exclude
    private List<OfferEntity> offers;

    @OneToMany(mappedBy = "credit")
    @ToString.Exclude
    private List<StatusHistoryEntity> statusHistories;



}
