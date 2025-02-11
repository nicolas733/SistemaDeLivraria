import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livros {
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;

    public Livros(int id, String titulo, Autor autor, boolean disponivel, LocalDate dataCadastro, LocalDate dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        this.dataCadastro = new Date();
        this.dataAtualizacao = new Date();
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void emprestar(){
        if(disponivel){
            disponivel = false;
        }
        else
            System.out.println("Este livro não esta disponivel!");
    }
}


