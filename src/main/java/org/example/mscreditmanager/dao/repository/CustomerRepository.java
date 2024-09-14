package org.example.mscreditmanager.dao.repository;

import org.example.mscreditmanager.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {

    Optional<CustomerEntity> findByPin(String pin);
}
