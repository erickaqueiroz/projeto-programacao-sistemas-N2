import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                    menuFinancas(sc);
                    break;

                case 2:
                    menuBiblioteca(sc);
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

    public static void menuFinancas(Scanner sc){
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
            System.out.print("Selecione uma opção:  ");

            op = sc.nextInt();
            sc.nextLine();

            Receita r1 = new Receita("Sálario Abril", 2500.00, LocalDate.parse("14/05/2026", dtf), "Empresa");
            Despesa d1 = new Despesa("Mercado", 3000, LocalDate.parse("14/05/2026"), "Casa");

            switch(op){

                case 1:
                    System.out.println("Cadastro de Receita");
                    break;

                case 2:
                    System.out.println("Cadastro de Despesa");
                    break;

                case 3:
                    System.out.println("Relatório Mensal");
                    break;
                
                case 4:
                    System.out.println("Relatório Mensal (Somente das Receitas)");
                    break;
                
                case 5:
                    System.out.println("Relatório Mensal (Somente das Despesas)");
                    break;

                case 6:
                    System.out.println("Relatório Anual");
                    break;

                case 7:
                    System.out.println("Relatório Anual (Somente das Receitas)");
                    break;

                case 8:
                    System.out.println("Relatório Anual (Somente das Despesas)");
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

    public static void menuBiblioteca(Scanner sc){
        int op = -1;

        while(op != 0){
            System.out.println("===== BIBLIOTECA DE OBJETOS =====");
            System.out.println("[1] CADASTRAR OBJETO");
            System.out.println("[2] BUSCAR OBJETO");
            System.out.println("[3] REGISTRAR EMPRÉSTIMO");
            System.out.println("[4] REGISTRAR DEVOLUÇÃO");
            System.out.println("[5] LISTAR ACERVO");
            System.out.println("[0] VOLTAR");
            System.out.print("Selecione uma opção:  ");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){

                case 1:
                    System.out.println("Cadastrando objeto");
                    break;

                case 2:
                    System.out.println("Buscando objeto...");
                    break;

                case 3:
                    System.out.println("Registrando emprestimo");
                    break;

                case 4:
                    System.out.println("Registrando devolução");
                    break;
                    
                case 5:
                    System.out.println("Listando acervos...");
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

