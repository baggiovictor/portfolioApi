package com.jogadores.api.jogador.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Table(name = "players")
public class Jogador {

    @Id
    private final UUID id;

    @Column(nullable = false)
    private final String name;

    private final String email;

    private final String password;

    private final String phone;

    @Builder
    public Jogador(String aName, String aEmail, String aPassword, String aPhone) {
        this.id = UUID.randomUUID();
        this.name = aName;
        this.password = aPassword;
        this.email = aEmail;
        this.phone = aPhone;
    }
}
