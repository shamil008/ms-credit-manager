package org.example.mscreditmanager.dao.repository;

import org.example.mscreditmanager.dao.entity.CreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<CreditEntity,Long> {
}
