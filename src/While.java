import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        int mesada = 50; // Valor inicial da mesada
        Scanner scanner = new Scanner(System.in);

        while (mesada > 0) {

            System.out.println("Digite o valor: ");
            int valor = scanner.nextInt();
            

            if (valor <= mesada) {
                mesada -= valor;
                System.out.println("Mesada restante: " + mesada);
            } else {
                System.out.println("Valor inválido! Valor aleatório é maior que a mesada.");
                continue; // Continua o loop, pedindo um novo valor ao usuário
            }
        }

        scanner.close();
    }
}