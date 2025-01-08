import java.util.Scanner;

public class Sumarmultiples3 {
	public static void main(String[] args) {
		Scanner lector= new Scanner (System.in);
	
		System.out.println("Fins a quin valor vols sumar multiples de 3?");
		int numero = lector.nextInt(), multiple = 0, suma=0;

		while (multiple<=numero)
		{
			if (multiple %3 ==0)
			{
				suma = suma +multiple;
				System.out.println("Agreguem "+ multiple + "...");
			}
			multiple = multiple + 1;
		}

		System.out.println("El resultat es "+ suma + ".");
	}
}