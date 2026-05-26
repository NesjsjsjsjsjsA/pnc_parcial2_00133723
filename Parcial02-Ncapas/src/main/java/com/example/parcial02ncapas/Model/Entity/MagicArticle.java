package com.example.parcial02ncapas.Model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.DecimalFormat;
import java.util.UUID;

@Entity
@Table(name = "magic_article")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MagicArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    private enum type{
        POCION,
        ARMA,
        ARMADURA
    };

    private DecimalFormat price; //Debe de ser decimal

    @ManyToOne
    @JoinColumn(name = "fk_magicArticle_id")
    private MagicProvider provider;
}
