import java.util.Scanner;
public class Zadatak5 {
/**
 * U ovoj funkciji provjeravamo koji su trocifreni brojevi djeljivi sa nasim brojem
 * kojeg cemo poslije koristiti kao unos.
 * @param broj = bilo koji integer, kojeg cemo koristiti kao unos.
 * @return = svi brojevi djeljivi sa nasim brojem.
 */
	public static int djeljivost(int broj){
		int i;
		for( i = 100; i<=999; i++){
			if(i%broj == 0)
				System.out.println(i);
		}
		return i;
	}
	/**
	 * U main funkciji unosimo nas broj i on poziva funkciju djeljivost da ispita koji su to brojevi
	 * djeljivi sa nasim brojem.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite  broj");
		int unos = in.nextInt();
		System.out.println("trocifreni brojevi koji su djeljivi sa " +unos +" su: ");
		djeljivost(unos);
	}
	
	
}
