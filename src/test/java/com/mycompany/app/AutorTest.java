package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutorTest {

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Alan Turing", 0, "Inglês");
        assertEquals("Alan Turing", autor.getNome());
    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Alan Turing", 0, "Inglês");
        assertEquals("Inglês", autor.getNacionalidade());
    }

    @Test
    public void testSetNome() {
        Autor autor = new Autor("Nome Antigo", 0, "Brasileira");
        autor.setNome("Novo Nome");
        assertEquals("Novo Nome", autor.getNome());
    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("Autor", 0, "Antiga");
        autor.setNacionalidade("Nova");
        assertEquals("Nova", autor.getNacionalidade());
    }

    @Test
    public void testDefaultIdadeIsZero() {
        Autor autor = new Autor("Autor", 0, "Brasileira");
        assertEquals(0, autor.getIdade());
    }

    @Test
    public void testSetIdade() {
        Autor autor = new Autor("Autor", 0, "Brasileira");
        autor.setIdade(42);
        assertEquals(42, autor.getIdade());
    }

    @Test
    public void testNomeNotNull() {
        Autor autor = new Autor("Nome", 0, "Nacionalidade");
        assertEquals(false, autor.getNome() == null);
    }

    @Test
    public void testNacionalidadeNotNull() {
        Autor autor = new Autor("Nome", 0, "Nacionalidade");
        assertEquals(false, autor.getNacionalidade() == null);
    }
}
