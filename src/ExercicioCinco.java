import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int limite = 20;
        int numAnterior = 0;
        int numAtual = 1;

        System.out.println("Os primeiros " + limite + " números da sequência de Fibonacci são: ");

        for(int i = 0; i < limite; i++){
            System.out.println(numAnterior + " ");

            int proximoNumero = numAnterior + numAtual;
            numAnterior = numAtual;
            numAtual = proximoNumero;
        }
    }
}
