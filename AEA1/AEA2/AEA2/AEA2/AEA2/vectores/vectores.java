package AEA2.vectores;

public class vectores {
    public static void main(String[] args) {
        int [] numeros = new int (7,8,9);
        numeros[0] = 7;
        numeros[1] = 8;
        numeros[2] = 9;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[i] + " ");
        }
        System.out.println();
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
    }
}
