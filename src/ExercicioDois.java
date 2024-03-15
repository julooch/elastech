import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular a tabuada: ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int resultado = i * num;
            System.out.println(i + " x " + num + " = " + resultado);
        }
    }
}
