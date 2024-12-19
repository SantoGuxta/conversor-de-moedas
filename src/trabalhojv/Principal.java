package trabalhojv;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
          //Menu de controle
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total");
            System.out.println("5. Calcular total convertido para Real");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: //Comandos de adição
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    System.out.print("Digite o tipo de moeda (Dolar, Euro, Real): ");
                    String tipoMoeda = scanner.next();
                    switch (tipoMoeda.toLowerCase()) {
                        case "dolar":
                            cofrinho.adicionar(new Dolar(valor));
                            break;
                        case "euro":
                            cofrinho.adicionar(new Euro(valor));
                            break;
                        case "real":
                            cofrinho.adicionar(new Real(valor));
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                    }
                    break;
                case 2: // Comandos de romoção
                    System.out.print("Digite o tipo de moeda a ser removida: ");
                    String tipoRemover = scanner.next();
                    System.out.print("Digite o valor da moeda a ser removida: ");
                    double valorRemover = scanner.nextDouble();
                    Moeda moedaRemover = null;
                    for (Moeda moeda : cofrinho.listaMoedas) {
                        if (moeda.getNome().equalsIgnoreCase(tipoRemover) && moeda.getValor() == valorRemover) {
                            moedaRemover = moeda;
                            break;
                        }
                    }
                    if (moedaRemover != null) {
                        cofrinho.remover(moedaRemover);
                        System.out.println("Moeda removida com sucesso.");
                    } else {
                        System.out.println("Moeda não encontrada no cofrinho.");
                    }
                    break;
                case 3: // Comandos do cofrinho
                    cofrinho.listagemMoedas();
                    break;
                case 4:
                    System.out.println("Total no cofrinho: " + cofrinho.totalConvertido());
                    break;
                case 5:
                    System.out.println("Total convertido para Real: " + cofrinho.totalConvertido());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
