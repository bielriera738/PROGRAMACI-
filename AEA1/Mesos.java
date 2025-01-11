import java.util.Scanner;

public class Mesos
{
	public static void main(String[] args) 
	{
	Scanner lector= new Scanner(System.in);
	System.out.println("Quin mes vols analitzar(1-12)?:");
	int mes= lector.nextInt();
	
	switch (mes)
	{
	
	case 1, 3, 5, 7, 10, 12:
		System.out.println("30 dies");
	break;
	
	case 2:
		System.out.println("28 o 29!");
	break;
	case 4,6,9,11:
		System.out.println("Els dies d'aquest mes son 31 dies");
	break;

	default:
		System.out.println("Aquest mes no existeix");
	break;
	}
	}
}