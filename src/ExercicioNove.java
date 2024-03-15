import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Converter de Celsius para Fahrenheit");
            System.out.println("2. Converter de Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = sc.next().charAt(0);

            if (opcao == '1') {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
            } else if (opcao == '2') {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é: " + celsius);
            } else if (opcao != '3') {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != '3');

        System.out.println("Obrigado por usar o conversor de temperatura!");

    }
}
