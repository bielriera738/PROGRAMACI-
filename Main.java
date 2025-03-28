public class Main {
    public static void main(String[] args) {
        // Creem un objecte de la classe Persona
        Persona persona1 = new Persona(1, 25, "Joan", "Garcia", "Carrer Major, 10");

        // Mostrem la informació de la persona
        System.out.println("Dades de la persona:");
        System.out.println(persona1);

        // Modifiquem alguns atributs amb els setters
        persona1.setAge(30);
        persona1.setAdreça("Avinguda Catalunya, 5");

        // Mostrem la informació actualitzada
        System.out.println("\nDades de la persona actualitzades:");
        System.out.println(persona1);

        // Accedim als atributs amb els getters
        System.out.println("\nNom de la persona: " + persona1.getName());
        System.out.println("Edat de la persona: " + persona1.getAge());
        System.out.println("Adreça de la persona: " + persona1.getAdreça());
    }
}