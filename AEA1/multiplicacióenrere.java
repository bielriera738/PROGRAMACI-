import java.util.Scanner;

public class multiplicacióenrere {
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);

		System.out.println("Quina taula de multiplicar vols?");
		int numero= lector.nextInt();
		
		int i = 10;
		int multiplicacio=0;

		while(i>=0) {

			
			System.out.println(+numero +"x" +i +" ="+multiplicacio);
			i= i-1;
			multiplicacio= i * numero;

		}
	
	}
}