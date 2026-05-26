package com.example.parcial02ncapas.Repository;

import com.example.parcial02ncapas.Model.Entity.MagicProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface iMagicProviderRepository extends JpaRepository<MagicProvider, Long> {
    @Query("SELECT u FROM MagicProvider u WHERE u.id = :id")
    MagicProvider findMagicProviderBy(String dui);
}
