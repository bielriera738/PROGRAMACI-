import java.util.Scanner;

public class descomptecontrolerrors {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quin es el preu del producte, en euros?");
		double preu = entrada	.nextDouble();

		if (preu < 0) {
		System.out.println("Preu incorrecte. Es negatiu");
		
		} else{
			double descompte=0;
			if ( preu>= 100) 
			{
				descompte=preu * 0.08;
			if (descompte >10) {
					descompte = 10;
				}
			}
		double preuFinal = preu - descompte;

		System.out.println("El preu final es de " + preuFinal + "euros.");
		}
		
	}
}