import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        HistoricoDeOperacoes historico = new HistoricoDeOperacoes();

        while (true) {
            System.out.println("\n1. Calcular operação");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            try {
                switch (opcao) {
                    case "1":
                        System.out.println("Digite a operação (ex: 1 + 2):");
                        String entrada = scanner.nextLine();
                        double resultado = calculadora.calcular(entrada);
                        System.out.println("Resultado: " + resultado);
                        historico.adicionar(new OperacaoRealizada(entrada, resultado));
                        break;
                    case "2":
                        System.out.println("Encerrando a calculadora.");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
