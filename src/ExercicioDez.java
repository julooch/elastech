import java.util.Scanner;

public class ExercicioDez {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] listaCompras = new String[10];

        System.out.println("Bem-vindo à lista de compras!");

        int indice = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Insira o item na lista de compras:");
            String item = sc.nextLine();

            listaCompras[indice] = item;
            indice++;

            System.out.println("Lista de compras atualizada:");
            for (int i = 0; i < indice; i++) {
                System.out.println((i + 1) + ". " + listaCompras[i]);
            }

            System.out.println("Deseja adicionar mais itens? (s/n)");
            String resposta = sc.nextLine().toLowerCase();

            if (!resposta.equals("s")) {
                continuar = false;
            }

            if (indice >= listaCompras.length) {
                System.out.println("A lista de compras está cheia!");
                continuar = false;
            }
        }

        System.out.println("Obrigado por usar a lista de compras!");
    }
}
