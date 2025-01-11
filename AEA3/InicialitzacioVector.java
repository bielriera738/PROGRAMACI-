package AEA2;
// Un programa que inicialitza proceduralment un array amb valors relacionats entre si.
public class InicialitzacioVector {
    public static void main(String[] args) {
        // Caldrà emmagatzemar 100 enters.
        int[] arrayValorsDobles = new int[100];

        // Omplim l'array amb valors parells seqüencials.
        for (int i = 0; i < arrayValorsDobles.length; i++) {
            arrayValorsDobles[i] = i * 2;
            System.out.print(arrayValorsDobles[i] + " ");
        }
        System.out.println();

        System.out.print("S'ha generat l'array: [");
        for (int i = 0; i < arrayValorsDobles.length; i++) {
            System.out.print(arrayValorsDobles[i] + " ");
        }
        System.out.print("]");

        for (int i = 0; i < arrayValorsDobles.length; i++) {
            System.out.print(arrayValorsDobles[i] + " ");
        }
        System.out.print("]");

    }
}
