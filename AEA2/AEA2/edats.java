package AEA2;

public class edats {
    public static void main(String[] args) {
        int edats [] = {20, 22,18, 35, 48, 26, 87, 70};
        float media, suma = 0;

        int length = edats.length;
        int EdatPetita= edats [0];
        int EdatGran = edats [0];

        for (int edat : edats) {

            suma += edat;

            if (edat < EdatPetita) {
                EdatPetita = edat;
            }
            if (edat > EdatGran) {
                EdatGran = edat;
                }
                }
                media = suma / length;
                System.out.println("El máximo es " + EdatGran);
                System.out.println("El mínimo es " + EdatPetita);
                System.out.println("La media es " + media);

    }
}

