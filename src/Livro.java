// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.time.LocalDate;

public class Livro extends Item{
    private String autor;
    private String genero;

    public Livro(String id, String nome, LocalDate dataAquisicao, float valor, String autor, String genero){
        super(id, nome, dataAquisicao, valor);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getGenero() {
        return this.genero;
    }
}
