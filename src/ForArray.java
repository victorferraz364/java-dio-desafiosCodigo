public class ForArray {
    public static void main (String[] args) {

        String lastNames[] = {"Pedro", "Júlio", "Cleitin", "Junior Rasta"};


        for (int i = 0; lastNames.length > i; i ++) {
            System.out.println(lastNames[ i ]);
        } 


        System.out.println("O de baixo foi usado um for 'Simples'' ");
        for (String name : lastNames) {
            System.out.println(name);
        
        }
      
    }
}
