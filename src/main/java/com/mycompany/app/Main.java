import java.util.Date;

public class Main {
   public static void main(String[] args) {
      // Criando autor
      Autor autor = new Autor("Jess", "Inglesa");

      //Criando livro
      Livro livro = new Livro("Java for Beginners", autor, "tecnologia", true);
      livro.validarDisponibilidade();

      //Criando usuário
      Usuario usuario = new Usuario("Jess", 21);

      //Criando emprestimo
      Emprestimo emprestimo = new Emprestimo((new Date()), (new Date()), livro, usuario);

      //Exibir dados na tela
      System.out.println("Livro: " + livro.getTitulo());
      System.out.println("Autor: " + livro.getAutor().getNome());
      System.out.println("Gênero: " + livro.getGenero());
      System.out.println("Usuário: " + usuario.getNome());
      System.out.println("Idade: " + usuario.getIdade());
      System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
      System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
   }
}