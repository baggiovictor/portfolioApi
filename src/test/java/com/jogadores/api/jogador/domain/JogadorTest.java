package com.jogadores.api.jogador.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void shouldCreateJogadorWithValidData() {
        Jogador jogador = Jogador.builder()
                .aName("Jane Doe")
                .aEmail("jane.doe@example.com")
                .aPassword("securepassword")
                .aPhone("0987654321")
                .build();

        assertNotNull(jogador.getId());
        assertEquals("Jane Doe", jogador.getName());
        assertEquals("jane.doe@example.com", jogador.getEmail());
        assertEquals("securepassword", jogador.getPassword());
        assertEquals("0987654321", jogador.getPhone());
    }

    @Test
    void shouldAllowNullEmail() {
        Jogador jogador = Jogador.builder()
                .aName("Jane Doe")
                .aPassword("securepassword")
                .aPhone("0987654321")
                .build();

        assertNotNull(jogador.getId());
        assertEquals("Jane Doe", jogador.getName());
        assertNull(jogador.getEmail());
        assertEquals("securepassword", jogador.getPassword());
        assertEquals("0987654321", jogador.getPhone());
    }

    @Test
    void shouldAllowNullPassword() {
        Jogador jogador = Jogador.builder()
                .aName("Jane Doe")
                .aEmail("jane.doe@example.com")
                .aPhone("0987654321")
                .build();

        assertNotNull(jogador.getId());
        assertEquals("Jane Doe", jogador.getName());
        assertEquals("jane.doe@example.com", jogador.getEmail());
        assertNull(jogador.getPassword());
        assertEquals("0987654321", jogador.getPhone());
    }

    @Test
    void shouldAllowNullPhone() {
        Jogador jogador = Jogador.builder()
                .aName("Jane Doe")
                .aEmail("jane.doe@example.com")
                .aPassword("securepassword")
                .build();

        assertNotNull(jogador.getId());
        assertEquals("Jane Doe", jogador.getName());
        assertEquals("jane.doe@example.com", jogador.getEmail());
        assertEquals("securepassword", jogador.getPassword());
        assertNull(jogador.getPhone());
    }
}