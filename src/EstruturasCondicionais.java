import java.util.Locale;
import java.util.Scanner;   

public class EstruturasCondicionais {
    public static void main (String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua nota: ");
        int nota = scanner.nextInt();

        if (nota >= 6) 
        System.out.println("VocÊ passou");

        else
        System.out.println("Você não passou");
        
                
        scanner.close();                 
    }
}