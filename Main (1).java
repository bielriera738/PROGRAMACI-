package Primer.UF4.SistemaReserves;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Allotjament[] allotjaments = new Allotjament[5];

        allotjaments[0] = new Habitacio("Habitació 101", 2, 3);
        allotjaments[1] = new Apartament("Apartament Blue", 4, 2, true);
        allotjaments[2] = new CasaRural("Masia Verda", 6, true, false);
        allotjaments[3] = new Habitacio("Habitació 202", 1, 1);
        allotjaments[4] = new CasaRural("Can Soler", 8, true, true);

        Scanner sc = new Scanner(System.in);
        String opcio;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar allotjaments disponibles");
            System.out.println("2. Reservar allotjament");
            System.out.println("3. Alliberar allotjament");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.nextLine();

            switch (opcio) {
                case "1":
                    for (Allotjament a : allotjaments) {
                        if (a.isDisponible()) System.out.println(a.mostrarInformacio());
                    }
                    break;
                case "2":
                    System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                    String nom = sc.nextLine();
                    for (Allotjament a : allotjaments) {
                        if (a.getNom().equalsIgnoreCase(nom)) {
                            if (a.reservar()) {
                                System.out.println("Reservat correctament.");
                            } else {
                                System.out.println("Ja està reservat.");
                            }
                        }
                    }
                    break;
                case "3":
                    System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                    nom = sc.nextLine();
                    for (Allotjament a : allotjaments) {
                        if (a.getNom().equalsIgnoreCase(nom)) {
                            a.alliberar();
                            System.out.println("Alliberat correctament.");
                        }
                    }
                    break;
            }
        } while (!opcio.equals("4"));
    }
}

