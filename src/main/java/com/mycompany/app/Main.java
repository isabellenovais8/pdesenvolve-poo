package com.mycompany.app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 0, "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Lucas Rafael", 25, null);
        Date dataAtual = new Date();

        List<Livro> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add(livro);

        Emprestimo emprestimo = new Emprestimo(usuario, livrosEmprestados, dataAtual, dataAtual);
        emprestimo.imprimirDetalhes();
    }
}
