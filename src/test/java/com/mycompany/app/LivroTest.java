package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", 0, "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", 0, "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testIsDisponivel() {
        Autor autor = new Autor("Jess", 0, "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertTrue(livro1.isDisponivel());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        Autor autor = new Autor("Jess", 0, "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);
        livro.setDisponivel(false);
        assertFalse(livro.isDisponivel());
    }
}
