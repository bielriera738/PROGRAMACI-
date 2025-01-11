
public class Matrius {
    public static void main(String[] args) {
        int[][] matriuParells = new int[5][4]; // Crear una matriz de 5 filas y 4 columnas

        // Inicializar toda la matriz con el valor -1
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                matriuParells[fila][columna] = -1; // Valor predeterminado
            }
        }

        // Sobrescribir ciertas posiciones con condiciones específicas
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                // Condición para sobrescribir con valores específicos
                if (fila == 1 && columna == 3) { // Ejemplo: fila 1, columna 3 es 1
                    matriuParells[fila][columna] = 1;
                }
                if (fila == 3 && (columna == 1 || columna == 3)) { // Fila 3, columnas 1 y 3 son 3
                    matriuParells[fila][columna] = 3;
                }
                // Imprimir el progreso del llenado
                System.out.println("La posició " + fila + " " + columna + " de la matriu matriuParells val: " + matriuParells[fila][columna]);
            }
            System.out.println("La fila " + fila + " de la matriu matriuParells ja està tota plena");
        }

        // Imprimir la matriz completaS
        System.out.println();
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriuParells[fila][columna] + " ");
            }
            System.out.println(" --> Fila " + fila);
        }
    }
}
