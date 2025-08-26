package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import java.util.*;

public class EmprestimoTest {

    @Test
    public void testEmprestimoMarcaLivroComoIndisponivel() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 0, "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21, null);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro);

        Emprestimo emprestimo = new Emprestimo(usuario, livros, dataRetirada, dataDevolucao);

        assertFalse(livro.isDisponivel());
    }
}
