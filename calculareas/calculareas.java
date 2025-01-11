import java.util.Scanner;
import java.lang.Math;

public class calculareas {
	public static void main(String[] args) {


		Scanner lector = new Scanner (System.in);
		System.out.println("Introdueix quin tipus de figura vols calcular area. \nPots escollir aquests: triangle, cercle, quadrat, rectangle, rombe, paralel·logram, trapezi. \nQuina es la teva eleccio?");
		String forma =lector.nextLine();
		double area=0;
		boolean existencia= false;

		if (forma.equals("triangle")) {
			System.out.println("La formula del triangle es base * altura / 2");
			System.out.println("Introdueix la altura en cm");
	    	double Altura= lector.nextDouble();
			System.out.println("Introdueix la base en cm");
	    	double Base = lector.nextDouble();
	    	area= Altura*Base/2;
	    	existencia=true;
		}
		else if (forma.equals("cercle")) { 
			System.out.println("La formula del cercle es: 3,14 * Radi elevat a 2");
			System.out.println("Introdueix el radi en cm");
			double Radi = lector.nextDouble();
			area= 3.14*Math.pow(Radi,2);
			existencia=true;
		}
		else if (forma.equals("trapezi")) {
			System.out.println("La formula del trapezi es (base major + base menor) *altura /2");
			System.out.println("Introdueix la base major en cm");
			double major= lector.nextDouble();
			double menor= lector.nextDouble();
			System.out.println("Introdueix la altura en cm");
			double Altura= lector.nextDouble();
			area= (major+menor) *Altura /2;
			existencia=true;
		}
		else if (forma.equals("rectangle")) {
			System.out.println("La formula del rectangle es:  (base * altura");
			System.out.println("Introdueix la base en cm");
			double Base= lector.nextDouble();
			System.out.println("Introdueix la altura en cm");
			double Altura= lector.nextDouble();
			area= Base*Altura;
			existencia=true;
		}
		else if (forma.equals("rombe")) {
			System.out.println("La formula del rombe es: (diagonal major * diagonal menor / 2");
			System.out.println("Introdueix la diagonal en cm");
			double major= lector.nextDouble();
			double menor= lector.nextDouble();
			area= major*menor /2;
			existencia=true;
		}
		else if (forma.equals("paralel·logram")) {
			System.out.println("La formula del paralel·logram es: base*altura");
			System.out.println("Introdueix la base en cm");
			double Base= lector.nextDouble();
			System.out.println("Introdueix la altura en cm");
			double Altura= lector.nextDouble();
			area= Altura*Base;
			existencia=true;
		}
		else if (forma.equals("quadrat")) {
			System.out.println("La formula del quadrat es: costat*costat");
			System.out.println("Introdueix el costat en cm");
			double Costat= lector.nextDouble();
			area= Math.pow(Costat, 2); 
			existencia=true;

		} else{
			System.out.println("La paraula que has introduït no esta a la llista");
		}

		if (existencia){
			System.out.println("El area del "+ forma +"es" + area + "cm2");
		}	

			
	}
}