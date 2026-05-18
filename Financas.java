import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Financas{
    private List<Transacao> transacoes;

    public Financas(){   
        transacoes = new ArrayList<>();
    }

    public void cadastrar(Receita receita){
        transacoes.add(receita);
    }

    public void cadastrar(Despesa despesa){
        transacoes.add(despesa);
    }

    public String gerarRelatorioMensal(int tipo, int mes, int ano){
        StringBuilder sb = new StringBuilder();

        // ordena da data mais antiga para mais recente
        transacoes.sort(Comparator.comparing(Transacao::getData));

        for(Transacao t : transacoes){
            // verifica mês e ano
            if(t.getData().getMonthValue() == mes &&
            t.getData().getYear() == ano){
                if(tipo == 0){
                    sb.append(t.toString()).append("\n");
                }
                else if(tipo == 1 && t instanceof Receita){    //"instanceof" = "essa transação é uma Receita?"
                    sb.append(t.toString()).append("\n");
                }
                else if(tipo == 2 && t instanceof Despesa){
                    sb.append(t.toString()).append("\n");
                }
            }
        }
        return sb.toString();
    }
}
