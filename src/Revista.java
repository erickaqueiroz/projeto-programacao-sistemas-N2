// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.time.LocalDate;

public class Revista extends Item {
    private String edicao;
    private String categoria;

    public Revista(String id, String nome, LocalDate dataAquisicao, float valor, String edicao, String categoria){
        super(id, nome, dataAquisicao, valor);
        this.edicao = edicao;
        this.categoria = categoria;
    }

    public String getEdicao(){
        return this.edicao;
    }

    public String getCategoria(){
        return this.categoria;
    }
}
