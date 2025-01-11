import java.util.Scanner;
import java.util.Random;

public class EndevinaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numero = random.nextInt(11); // Genera un número entre 0 i 10
        int vides = 3;
        boolean encertat = false;

        System.out.println("Comencem el joc.");
        System.out.println("Endevina el valor entre 0 i 10 en tres vides.");

        while (vides > 0 && !encertat) {
            System.out.print("Introdueix un valor enter entre 0 i 10: ");
            int intentUsuari = scanner.nextInt();

            if (intentUsuari == numero) {
                System.out.println("Enhorabona. Ho has encertat!");
                encertat = true;
            } else if (vides > 1) {
                System.out.println("Has fallat! Torna a intentar-ho.");
                vides--; // Restar una vida
            } else{
                vides--; // Restar la utima vida
                System.out.println("Has fallat! vides esgotades. Has perdut!");
            }
        }

        if (!encertat) {
            System.out.println("El número correcte era: " + numero);
        }
    }
}


