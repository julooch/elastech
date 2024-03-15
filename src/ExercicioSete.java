import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char opcao;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = sc.next().charAt(0);

            if (opcao >= '1' && opcao <= '4') {
                System.out.print("Digite o primeiro número: ");
                double numero1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double numero2 = sc.nextDouble();
                double resultado;

                switch (opcao) {
                    case '1':
                        resultado = numero1 + numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '2':
                        resultado = numero1 - numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '3':
                        resultado = numero1 * numero2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case '4':
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Erro: divisão por zero!");
                        }
                        break;
                }
            } else if (opcao != '5') {
                System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        } while (opcao != '5');

        System.out.println("Obrigado por usar a calculadora!");
    }
}
