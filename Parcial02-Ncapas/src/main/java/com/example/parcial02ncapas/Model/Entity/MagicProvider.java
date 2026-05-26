package com.example.parcial02ncapas.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "magicProvider_data")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MagicProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private enum type {
        POCION,
        ARMA,
        ARMADURA
    };
}
