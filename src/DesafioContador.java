import java.util.Scanner;

public class DesafioContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
        

        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        
        if (parametroUm >= parametroDois) {
            System.out.println("O primeiro número não pode ser maior que o segundo");
        }
        int contagem = parametroDois - parametroUm;
        
        for (int i = 0; i < contagem; i++) {
            System.out.println(i + 1);
        }

    }

    public class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            
        }
    }

}