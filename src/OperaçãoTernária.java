import java.util.Locale;
import java.util.Scanner;   
public class OperaçãoTernária {


    public static void main (String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        String resultado = nota >= 6 ? "Aprovado" : "Reprovado";
                
        System.out.println(resultado);
        scanner.close();
    }
}
