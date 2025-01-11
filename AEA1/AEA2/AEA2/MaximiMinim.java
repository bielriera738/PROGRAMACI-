public class MaximiMinim {
    public static void main(String[] args) {
        int[] vector = {12,3,45, -3, 65, -5 ,88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
        int max = vector[0];
        int min = vector[0];

        // Recorregut del vector
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
        }

        // Resultats
        System.out.println("El número més petit és: " + min);
        System.out.println("El número més gran és: " + max);
    }
}
