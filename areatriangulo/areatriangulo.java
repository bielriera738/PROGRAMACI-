import java.util.Scanner;

public class areatriangulo{
	public static void main(String[] args) 
	{
		Scanner entrada=new Scanner (System.in);

		System.out.println("Area del triangulo");
	
		double base,altura,area;

		System.out.println("Ingrese la base:");
		base=entrada.nextDouble();

		System.out.println("Ingrese la altura");
		altura=entrada.nextDouble();
 
		area=(base*altura) /2;
		System.out.println("El area del triangulo es:" +area);
}
	}