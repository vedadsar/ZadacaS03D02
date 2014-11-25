import java.util.Scanner;
public class Zadatak8 {
	/**
	 * Funkcija pomocu " % " i brojaca izuzima cifru pod nekim rednim brojem.
	 * @param broj = bilo koji integer iz kojeg cemo izvalicit cifru
	 * @param redniBroj = redni broj cifre.
	 * @return =  cifra pod rednim brojem.
	 */
	public static int vratiCifru ( int broj, int redniBroj){
		int brojac = 0;
		int ostatak=0;
		while( brojac < redniBroj){
			ostatak=broj%10;
			broj = broj/10;
			brojac++;
		}
		System.out.print(ostatak);
		return ostatak;
	}
	
	/**
	 * U main funkciji unosimo neki integer broj i redni broj cifre koju zelimo da izuzmemo.
	 * Zatim se poziva funkcija vratiCifru koja izuzima cifru pod rednim brojem koji smo unijeli.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite broj");
		int broj = in.nextInt();
		System.out.println("Unesite redni broj cifre");
		int redniBrojCifre = in.nextInt();
		
		System.out.println("Cifra pod rednim brojem: " + redniBrojCifre +" je: " );
		vratiCifru(broj,redniBrojCifre);
	}

}
