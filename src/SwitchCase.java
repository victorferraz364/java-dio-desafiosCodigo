import java.util.Locale;
import java.util.Scanner;   
public class SwitchCase {


public static void main (String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("1 - Grande, 2 - Pequeno, 3 - Médio");

    System.out.println("Digite a opção desejada: ");
    int option = scanner.nextInt();

    switch (option) {
        case 1: {
            System.out.println("Grande");
            break;
        }
        case 2: {
            System.out.println("Pequeno");
            break;
        }
        case 3: {
            System.out.println("Médio");
            break;
        }
        default:
        System.out.println("Opção Inválida");

    }
    scanner.close();
}
}
