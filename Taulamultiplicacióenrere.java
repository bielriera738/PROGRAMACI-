import java.util.Scanner;

public class multiplicacióenrere {
	public static void main(String[] args) {
		Scanner lector= new Scanner(System.in);

		System.out.println("Quina taula de multiplicar vols?");
		int numero= lector.nextInt();
		
		int i = 1;
		int multiplicacio=0;

		while(i<=1) {

			multiplicacio= i * numero;
			System.out.println(+numero +"x" +i +" ="+multiplicacio);
			i --;


		}
	
	}
}