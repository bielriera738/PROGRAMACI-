import java.util.Scanner;

public class trianglenombrerepe{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numLineas = scanner.nextInt();

        for (int i = 1; i <= numLineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}