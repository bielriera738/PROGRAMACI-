package AEA2;

import java.util.Scanner;

public class cars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cars = new String[4]; // Vector amb espai per a 4 cotxes

        System.out.println("Introdueix 4 marques de cotxes:");

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Marca de cotxe " + (i + 1) + ": ");
            cars[i] = scanner.nextLine(); // Introducció de dades per l'usuari
        }

        System.out.println("\nLes marques introduïdes són:");
        for (String car : cars) {
            System.out.println(car); // Impressió dels cotxes introduïts
        }

        scanner.close(); // Tanquem el Scanner
    }
}

