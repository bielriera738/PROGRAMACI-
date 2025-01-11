public class Matrius2 {
public static void main(String[] args) {
    int[][] matriz = new int[5][4];

    // Llenar la matriz según las condiciones
    for (int fila = 0; fila < matriz.length; fila++) {
        for (int columna = 0; columna < matriz[0].length; columna++) {
            // Utilizar el operador módulo (%) para determinar si un número es par o impar
            matriz[fila][columna] = (fila % 2) * 2 + (columna % 2) + 1;
        }
    }

    // Imprimir la matriz
    for (int fila = 0; fila < matriz.length; fila++) {
        for (int columna = 0; columna < matriz[0].length; columna++) {
            System.out.print(matriz[fila][columna] + " ");
        }
        System.out.println();
    }
}
} 
