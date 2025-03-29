import java.util.Date;

public class Main {
   public static void main(String[] args) {
      // Criando autor
      Autor autor = new Autor();
      autor.setNome("Jessica Felix");
      autor.setNacionalidade("Brasileira");

      //Criando livro
      Livro livro = new Livro();
      livro.setTitulo("Java for Beginners");  
      livro.setAutor(autor);
      livro.setGenero("Tecnologia");
      livro.setValidarDisponibilidade();

      //Criando usuário
      Usuario usuario = new Usuario();
      usuario.setIdade(0);
      usuario.setNome(null);
   }
}