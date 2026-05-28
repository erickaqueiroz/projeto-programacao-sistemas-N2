// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Financas {
    private List<Transacao> transacoes;

    public Financas() {
        transacoes = new ArrayList<>();
    }

    public void cadastrar(Receita receita) {
        transacoes.add(receita);
    }

    public void cadastrar(Despesa despesa) {
        transacoes.add(despesa);
    }

    public String gerarRelatorioMensal(int tipo, int mes, int ano) {

        StringBuilder sb = new StringBuilder();

        transacoes.sort(Comparator.comparing(Transacao::getData));

        for (Transacao t : transacoes) {

            if (t.getData().getMonthValue() == mes &&
                t.getData().getYear() == ano) {

                if (tipo == 0) {
                    sb.append(t.toString()).append("\n");
                }

                else if (tipo == 1 && t instanceof Receita) {
                    sb.append(t.toString()).append("\n");
                }

                else if (tipo == 2 && t instanceof Despesa) {
                    sb.append(t.toString()).append("\n");
                }
            }
        }

        return sb.toString();
    }

    public String gerarRelatorioAnual(int tipo, int ano) {

        StringBuilder sb = new StringBuilder();

        transacoes.sort(Comparator.comparing(Transacao::getData));

        for (Transacao t : transacoes) {

            if (t.getData().getYear() == ano) {

                if (tipo == 0) {
                    sb.append(t.toString()).append("\n");
                }

                else if (tipo == 1 && t instanceof Receita) {
                    sb.append(t.toString()).append("\n");
                }

                else if (tipo == 2 && t instanceof Despesa) {
                    sb.append(t.toString()).append("\n");
                }
            }
        }

        return sb.toString();
    }
}