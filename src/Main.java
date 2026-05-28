// Nome: Ericka Fernanda Lima de Queiroz - 10420084
// Nome: Leticia Sampaio Cosmo - 10438865

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Financas financas = new Financas();
        Biblioteca biblioteca = new Biblioteca();

        int opcao = -1;

        while(opcao != 0){

            System.out.println("===== SISTEMA FIN-E-BOB =====");
            System.out.println("[1] MINHAS FINANÇAS");
            System.out.println("[2] BIBLIOTECA DE OBJETOS");
            System.out.println("[0] SAIR");
            System.out.print("Selecione uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    menuFinancas(sc, financas);
                    break;
                case 2:
                    menuBiblioteca(sc, biblioteca);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void menuFinancas(Scanner sc, Financas financas){

        int op = -1;

        while(op != 0){

            System.out.println("===== MINHAS FINANÇAS =====");
            System.out.println("[1] CADASTRAR RECEITA");
            System.out.println("[2] CADASTRAR DESPESA");
            System.out.println("[3] GERAR RELATÓRIO MENSAL");
            System.out.println("[4] GERAR RELATÓRIO MENSAL (SOMENTE RECEITAS)");
            System.out.println("[5] GERAR RELATÓRIO MENSAL (SOMENTE DESPESAS)");
            System.out.println("[6] GERAR RELATÓRIO ANUAL");
            System.out.println("[7] GERAR RELATÓRIO ANUAL (SOMENTE RECEITAS)");
            System.out.println("[8] GERAR RELATÓRIO ANUAL (SOMENTE DESPESAS)");
            System.out.println("[0] VOLTAR");
            System.out.print("Selecione uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:
                    System.out.println("Cadastro de Receita");

                    System.out.print("Descreva a receita: ");
                    String descricaoRec = sc.nextLine();

                    System.out.print("Informe o valor da receita: ");
                    float valorRec = sc.nextFloat();
                    while(valorRec <= 0){
                        System.out.print("Valor inválido. Digite novamente: ");
                        valorRec = sc.nextFloat();
                    }
                    sc.nextLine();

                    System.out.print("Informe a data (AAAA-MM-DD): ");
                    String dataTextoRec = sc.nextLine();

                    System.out.print("Informe a origem: ");
                    String origemRec = sc.nextLine();

                    try{
                        LocalDate dataRec = LocalDate.parse(dataTextoRec);
                        financas.cadastrar(new Receita(descricaoRec, valorRec, dataRec, origemRec));
                        System.out.println("Receita cadastrada com sucesso!");
                    } catch(Exception e){
                        System.out.println("Data inválida!");
                    }

                    break;

                case 2:
                    System.out.println("Cadastro de Despesa");

                    System.out.print("Descreva a despesa: ");
                    String descricaoDes = sc.nextLine();

                    System.out.print("Informe o valor da despesa: ");
                    float valorDes = sc.nextFloat();
                    while(valorDes <= 0){
                        System.out.print("Valor inválido. Digite novamente: ");
                        valorDes = sc.nextFloat();
                    }
                    sc.nextLine();

                    System.out.print("Informe a data (AAAA-MM-DD): ");
                    String dataTextoDes = sc.nextLine();
                    System.out.print("Informe o destino: ");
                    String destinoDes = sc.nextLine();

                    try{
                        LocalDate dataDes = LocalDate.parse(dataTextoDes);
                        financas.cadastrar(new Despesa(descricaoDes, valorDes, dataDes, destinoDes));
                        System.out.println("Despesa cadastrada com sucesso!");
                    } catch(Exception e){
                        System.out.println("Data inválida!");
                    }

                    break;

                case 3:
                    System.out.println("Relatório Mensal");

                    System.out.print("Informe o mês desejado: ");
                    int mes = sc.nextInt();
                    sc.nextLine();

                    while(mes < 1 || mes > 12){
                        System.out.print("Mês inválido. Digite novamente: ");
                        mes = sc.nextInt();
                        sc.nextLine();
                    }

                    System.out.print("Informe o ano desejado: ");
                    int ano = sc.nextInt();
                    sc.nextLine();

                    System.out.println(
                            financas.gerarRelatorioMensal(0, mes, ano)
                    );

                    break;

                case 4:
                    System.out.println("Relatório Mensal (Somente Receitas)");

                    System.out.print("Informe o mês desejado: ");
                    int mesRec = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o ano desejado: ");
                    int anoRec = sc.nextInt();
                    sc.nextLine();

                    System.out.println(
                            financas.gerarRelatorioMensal(1, mesRec, anoRec)
                    );

                    break;

                case 5:
                    System.out.println("Relatório Mensal (Somente Despesas)");

                    System.out.print("Informe o mês desejado: ");
                    int mesDes = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o ano desejado: ");
                    int anoDes = sc.nextInt();
                    sc.nextLine();

                    System.out.println(
                            financas.gerarRelatorioMensal(2, mesDes, anoDes)
                    );

                    break;

                case 6:
                    System.out.println("Relatório Anual");

                    System.out.print("Informe o ano desejado: ");
                    int anoAnual = sc.nextInt();
                    sc.nextLine();

                    System.out.println(financas.gerarRelatorioAnual(0, anoAnual));

                    break;

                case 7:
                    System.out.println("Relatório Anual (Somente Receitas)");

                    System.out.print("Informe o ano desejado: ");
                    int anoRecAnual = sc.nextInt();
                    sc.nextLine();

                    System.out.println(financas.gerarRelatorioAnual(1, anoRecAnual));

                    break;

                case 8:
                    System.out.println("Relatório Anual (Somente Despesas)");

                    System.out.print("Informe o ano desejado: ");
                    int anoDesAnual = sc.nextInt();
                    sc.nextLine();

                    System.out.println(financas.gerarRelatorioAnual(2, anoDesAnual));

                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }
    }

    public static void menuBiblioteca(Scanner sc, Biblioteca biblioteca){

        int op = -1;

        while(op != 0){

            System.out.println("===== BIBLIOTECA DE OBJETOS =====");
            System.out.println("[1] CADASTRAR OBJETO");
            System.out.println("[2] BUSCAR OBJETO");
            System.out.println("[3] REGISTRAR EMPRÉSTIMO");
            System.out.println("[4] REGISTRAR DEVOLUÇÃO");
            System.out.println("[5] LISTAR ACERVO");
            System.out.println("[0] VOLTAR");
            System.out.print("Selecione uma opção: ");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:
                    String autor = null;
                    String genero = null;
                    String edicao = null;
                    String categoria = null;

                    System.out.println("Cadastrar objeto");

                    System.out.println(
                            "Informe qual tipo de objeto será cadastrado:" +
                            "\n[1] Livro" +
                            "\n[2] Revista"
                    );

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    while(tipo != 1 && tipo != 2){
                        System.out.print("Opção inválida! Digite novamente: ");
                        tipo = sc.nextInt();
                        sc.nextLine();
                    }

                    if(tipo == 1){
                        System.out.print("Informe o nome do autor: ");
                        autor = sc.nextLine();

                        System.out.print("Informe o gênero do livro: ");
                        genero = sc.nextLine();
                    } else {
                        System.out.print("Informe a edição da revista: ");
                        edicao = sc.nextLine();

                        System.out.print("Informe a categoria da revista: ");
                        categoria = sc.nextLine();
                    }

                    System.out.print("Informe o id do objeto: ");
                    String id = sc.nextLine();

                    System.out.print("Informe o nome do objeto: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a data de aquisição (AAAA-MM-DD): ");
                    String dataAquisicao = sc.nextLine();

                    System.out.print("Informe o valor do objeto: ");
                    float valor = sc.nextFloat();
                    while(valor <= 0){
                        System.out.print("Valor inválido. Digite novamente: ");
                        valor = sc.nextFloat();
                    }
                    sc.nextLine();

                    try{
                        LocalDate data = LocalDate.parse(dataAquisicao);

                        if(tipo == 1){
                            biblioteca.cadastrar(new Livro(id, nome, data, valor, autor, genero));
                        } else {
                            biblioteca.cadastrar(new Revista(id, nome, data, valor, edicao, categoria));
                        }

                        System.out.println("Objeto cadastrado com sucesso!");

                    } catch(Exception e){
                        System.out.println("Data inválida!");
                    }

                    break;

                case 2:
                    System.out.println("Buscar objeto");

                    System.out.print("Informe o termo que deseja buscar: ");
                    String termo = sc.nextLine();

                    System.out.println(biblioteca.buscar(termo));

                    break;

                case 3:
                    System.out.println("Registrar empréstimo");

                    System.out.print("Informe o id do objeto que deseja emprestar: ");
                    String idObjeto = sc.nextLine();

                    int statusEmprestimo = biblioteca.emprestar(idObjeto);

                    if(statusEmprestimo == 1){
                        System.out.println("Objeto foi emprestado");
                    }
                    else if(statusEmprestimo == 2){
                        System.out.println("Objeto já está emprestado");
                    }
                    else{
                        System.out.println("Objeto não existe no acervo");
                    }

                    break;

                case 4:
                    System.out.println("Registrar devolução");

                    System.out.print("Informe o id do objeto: ");
                    String idDevolucao = sc.nextLine();

                    int statusDevolucao = biblioteca.devolver(idDevolucao);

                    if(statusDevolucao == 1){
                        System.out.println("Objeto foi devolvido");
                    }
                    else if(statusDevolucao == 2){
                        System.out.println("Objeto não estava emprestado");
                    }
                    else{
                        System.out.println("Objeto não existe no acervo");
                    }

                    break;

                case 5:
                    System.out.println("Listando acervo...");
                    System.out.println(biblioteca.obterAcervo());
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }
    }
}
