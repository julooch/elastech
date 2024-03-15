import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 1;
        int soma = 0;
        int repeticao = -1;
        int media;

        while(num > 0) {
            System.out.println("Digite um número inteiro positivo: ");
            num = sc.nextInt();

            soma = soma + num;
            repeticao++;
        }

        media = soma / repeticao;

        System.out.println("A média dos seus números digitados é igual a: " + media);

    }
}
