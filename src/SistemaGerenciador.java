import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class SistemaGerenciador {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        Autor autor1 = new Autor(1,"William Shakespeare",  LocalDate.of(1839,06,21));
        Autor autor2 = new Autor(2, "Monteiro Lobato",  LocalDate.of(1564,03,23));
        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);

        Livros livro1 = new Livros(1, "Romeu e Julieta. ", autor1, true, LocalDate.now(),LocalDate.now());
        Livros livro2 = new Livros(2, "O Picapau Amarelo. ", autor2,true, LocalDate.now(),LocalDate.now());
        Livros livro3 = new Livros(3, "O Mercador de Veneza. ", autor1,true, LocalDate.now(),LocalDate.now());
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);


        System.out.println("Bem-vindo a Biblioteca online! Selecione alguma opção:");
        System.out.println("-".repeat(15));

       while (true) {
           System.out.println("Opções:");
           System.out.println("1- Emprestar um livro.");
           System.out.println("2- Verificar livros disponiveis.");
           System.out.println("3- Sair.");
           System.out.println("4- Finalizar sistema.");
           System.out.println("Resposta: ");
           String opcao = scanner.nextLine();
           System.out.println("-".repeat(15));
           if (opcao.equals("1")) {
               System.out.println("Digite seu nome: ");
               Clientes nome1 = new Clientes(scanner.nextLine());
               biblioteca.adicionarCliente(nome1);
               biblioteca.listarLivrosDisponiveis();
               System.out.println("Digite o ID do livro que gostaria de emprestar: ");
               int id = Integer.parseInt(scanner.nextLine());
               biblioteca.emprestarLivro(id);
           }
           else if (opcao.equals("2")) {
               biblioteca.listarLivrosDisponiveis();
           }
           else if (opcao.equals("3")) {
               System.out.println("Saindo da conta de ");
           }
           else if(opcao.equals("4")){
               System.out.println("Fechando Sistema de Livros");
               break;
           }
           else {
               System.out.println("Digitou corretamente? Tente novamente");
           }
       }
    }
}
