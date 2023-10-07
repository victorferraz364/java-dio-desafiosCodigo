public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int idade = 22;
        if (idade >= 20) {
            System.out.println("sua idade é :" + idade);
        } else {
             System.out.println("sua idade não é 20:");
             Pessoa("victor", 21);
             
        }
    }
    public static String Pessoa (String nome, int idade) {
        nome = "";
        idade = 0;
        return nome + "" + idade;
    }
}
