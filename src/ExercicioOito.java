import java.util.Random;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("O número secreto é menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);
    }
}
