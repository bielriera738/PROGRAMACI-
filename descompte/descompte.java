import java.util.Scanner;

public class descompte 
{
	public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);

	System.out.println("El descompte del 15% en compres és menor a 95 euros");

	double preu, descompte, total;

	System.out.println("Posa el preu:");
	preu = entrada.nextDouble();

	if (preu<=95)
	{
		descompte = preu * 0.15;
		total = descompte - preu;

	System.out.println("El descompte es de " + descompte + "euros");
	System.out.println("El total es de " + total + "euros");
	}
	else{
	System.out.println("No te descompte");}
}
}