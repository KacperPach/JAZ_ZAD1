package com.JAZ1.zad1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PotionsRepository extends JpaRepository<Potion, UUID> {
}
