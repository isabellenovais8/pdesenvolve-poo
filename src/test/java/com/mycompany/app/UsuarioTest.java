package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 21, null);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21, null);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetNome() {
        Usuario usuario = new Usuario("Antigo", 30, null);
        usuario.setNome("Novo");
        assertEquals("Novo", usuario.getNome());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario("Teste", 30, null);
        usuario.setIdade(40);
        assertEquals(40, usuario.getIdade());
    }
}