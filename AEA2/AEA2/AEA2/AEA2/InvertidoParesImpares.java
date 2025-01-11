package AEA2;

public class InvertidoParesImpares {
    public static void main(String[] args) {
        // Tamaño fijo del vector
        int tamaño = 100;

        // Vectores
        int[] pares = new int[tamaño];
        int[] impares = new int[tamaño];
        int[] combinado = new int[tamaño * 2];

        // Llenamos los vectores de pares e impares
        for (int i = 0; i < tamaño; i++) {
            pares[i] = i * 2;           // Pares: 0, 2, 4, ...
            impares[i] = i * 2 + 1;     // Impares: 1, 3, 5, ...
        }

        // Combinamos en orden invertido: impares primero, pares después
        for (int i = 0; i < tamaño; i++) {
            combinado[i] = impares[tamaño - 1 - i]; // Impares en orden invertido
            combinado[tamaño + i] = pares[tamaño - 1 - i]; // Pares en orden invertido
        }

        // Imprimimos los vectores
        System.out.println("Vector de pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Vector de impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Vector combinado (impares invertidos, pares invertidos):");
        for (int num : combinado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

		
