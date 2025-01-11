import java.util.Scanner;
public class Posterior10{
	public static void main(String[] args) {
	Scanner lector= new Scanner(System.in);

	System.out.println("Desde quin numero vols començar");
	int numeroIntro= lector.nextInt(System.in);

	int condicionant = numeroIntro + 101;

	for(int i= numeroIntro; i <condicionant; i++){
		if (i % 5 == 0){
			System.out.println();
		}
	}
	}
}
