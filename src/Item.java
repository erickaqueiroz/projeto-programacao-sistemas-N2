// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.time.LocalDate;

public abstract class Item {
    private String id;
    protected String nome;
    protected LocalDate dataAquisicao;
    protected float valor;
    protected boolean disponivel;

    public Item(String id, String nome, LocalDate dataAquisicao, float valor){
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.valor = valor;
        this.disponivel = true;
    }

    public String getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public LocalDate getDataAquisicao(){
        return this.dataAquisicao;
    }

    public float getValor(){
        return this.valor;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public boolean emprestar(){
        if(this.disponivel) {
            this.disponivel = false;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            return true;
        }

        return false;
    }

    @Override
    public String toString(){
        
        String disponibilidade;
        if (disponivel) {
            disponibilidade = "item disponível";
        } else {
            disponibilidade = "item indisponível";
        }

        return "------Informações Item------" + "\n" +
        "Id: " + getId() + "\n" +
        "Nome: " + getNome() + "\n" +
        "Data de aquisição: " + getDataAquisicao() + "\n" +
        "Valor: " + getValor() + "\n" +
        "Disponibilidade: " + disponibilidade;
    } 
}