package Primer.UF4.SistemaReserves;
public class reserva {
    
    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            allotjaments[] allotjaments = new allotjaments[5];

            allotjaments[0] = new Habitacio("Habitació 101", 2, 3);
            allotjaments[1] = new Apartament("Apartament Blue", 4, 2, true);
            allotjaments[2] = new CasaRural("Masia Verda", 6, true, false);
            allotjaments[3] = new Habitacio("Habitació 202", 1, 1);
            allotjaments[4] = new CasaRural("Can Soler", 8, true, true);

            String opcio;

            boolean while1 = true;

            while (while1) {
                System.out.println("\nMenú:");
                System.out.println("1. Mostrar allotjaments disponibles");
                System.out.println("2. Reservar allotjament");
                System.out.println("3. Alliberar allotjament");
                System.out.println("4. Sortir");
                System.out.print("Tria una opció: ");
                opcio = sc.nextLine();

                


}
    }
}
