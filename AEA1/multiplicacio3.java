import java.util.Scanner;

public class multiplicacio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Fins a quina taula de multiplicar vols conèixer? ");
        int limit = scanner.nextInt();

        // Bucle per a cada taula de multiplicar fins al número indicat
        for (int i = 1; i <= limit; i++) {
            System.out.println("\nLa taula del " + i);
            
            // Bucle per mostrar cada multiplicació de la taula
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            
            // Afegim una línia separadora entre taules, excepte després de l'última
            if (i != limit) {
                System.out.println("--------");
            }
        }

        scanner.close();
    }
}