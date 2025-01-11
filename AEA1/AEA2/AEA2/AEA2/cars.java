package AEA2;

import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = new String[4];
        System.out.println("Volvo", "BMW", "Ford", "Madza");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            System.out.print("Cotxe " + (i + 1) + ": ");
            cars[i] = scanner.nextLine();
            System.out.println("\nEls cotxes introduïts són:");
            for (int i=0)
                System.out.println(cars[i]);
    }
        }
    }
