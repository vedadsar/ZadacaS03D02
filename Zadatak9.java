import java.util.Scanner;
public class Zadatak9 {
  
	
	/**
	 * Ova funkcija je mnoziti broj samim sobom "stepen" puta.
	 * @param broj = integer, baza broja kojeg cemo stepenova.
	 * @param stepen =integer, stepen na koji cemo podici bazu broja.
	 * @return
	 */
	public static int Stepenovanje(int broj, int stepen){
		int i;
		int kopijaBroja = broj;
					
		for (i = 1; i<stepen;i++){
			broj = kopijaBroja * broj;
		}
		System.out.println(broj);
		return broj;
	}
	
	/**
	 * U mainu uosimo bazu i stepen, te pozivamo funkciju stepenovanje.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite bazu broja");
		int baza = in.nextInt();
		System.out.println("Unesite nesite stepen kojim hocete da stepenujete taj broj");
		int stepen = in.nextInt();
		
		if (stepen == 0){
			System.out.println("Svako broj na 0 je 1!!!");
			return;
		}
		
		System.out.println(baza + " na stepen " +stepen +" je: ");
		Stepenovanje(baza, stepen);
	}
	
	
}
