import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livros> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Clientes> clientes = new ArrayList<>();


    void adicionarLivro(Livros livro) {
        livros.add(livro);
    }
    void adicionarAutor(Autor autor) {
        autores.add(autor);
    }
    void adicionarCliente(Clientes cliente) {
        clientes.add(cliente);
    }

    public void listarLivrosDisponiveis() {
        boolean encontrado = false;
        System.out.println("Livros disponiveis: ");
        for (Livros livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println("ID- " + livro.getId() + " -Titulo- " + livro.getTitulo() + " - Autor- " + livro.getAutor());
                System.out.println("-".repeat(15));
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro disponivel");
        }
    }
    public void emprestarLivro(int id) {
        for (Livros livro : livros) {
            if (livro.getId() == id) {
                System.out.println("Emprestando livro: " + livro.getTitulo());
                livro.emprestar();
            }
        }
        for (Clientes cliente : clientes) {
            System.out.println("Emprestado com sucesso para: "+ cliente.getCliente());
            return;
        }
        System.out.println("Livro não encontrado!");
    }
}
