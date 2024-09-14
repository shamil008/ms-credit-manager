package org.example.mscreditmanager.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.mscreditmanager.model.enums.CreditStatus;

import java.time.LocalDateTime;

@Entity
@Table(name = "status_histories")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StatusHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CreditStatus creditStatus;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private CreditEntity credit;
}
