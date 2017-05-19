import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        OUTER:
        while (true) {

            System.out.println("-------- Menu Tabela Brasileirão --------");
            System.out.println("1 - Mostrar Tabela.\n2 - Criar uma nova tabela.\n3 - Atualizar tabela existente.\n4 - Sair.\nOpção: ");
            String opt = sc.nextLine();
            int op = Integer.parseInt(opt);

            switch (op) {
                case 1:
                    controller.mostrarTabela();
                    break;
                case 2:
                    System.out.println("Essa opção vai excluir completamente a tabela atual. Deseja continuar? [y/N]");
                    String o = scn.nextLine();
                    if (o.equals("y") || o.equals("Y")) {
                        controller.criarNovaTabela();
                    }
                    break;
                case 3:
                    controller.attTabela();
                    break;
                case 4:
                    break OUTER;
                default:
                    controller.mostrarTabela();
                    break;
            }
        }
    }
}
