// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Receita extends Transacao{
    private String origem;

    public Receita(String descricao, float valor, LocalDate data, String origem){
        super(descricao, valor, data);
        this.origem = origem;
    }

    public String getOrigem(){
        return this.origem;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return getDescricao() +
                " R$ " + String.format("%.2f", getValor()) +
                " " + getData().format(dtf) +
                " " + getOrigem();
    }  
}
