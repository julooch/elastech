import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu número para descobrir se é primo: ");
        int num = sc.nextInt();
        boolean primo = true;

        if(num <= 1){
            primo = false;
        }else{
            for(int i = 2; i <= Math.sqrt(num); i++){
                if(num % i == 0){
                    primo = false;
                    break;
                }
            }
        }

        if (primo){
            System.out.println("Seu número é primo.");
        }else{
            System.out.println("Seu número não é primo.");
        }

    }
}
