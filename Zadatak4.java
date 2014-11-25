import java.util.Scanner;

public class Zadatak4 {
/**
 * U ovoj funkciji Mnozimo sve cifre jednog broja.
 * @param broj = bilo koji integer
 * @return = produkt cifara tog broja.
 */
	public static int proizvod(int broj) {

		String velicina = "" + broj;
		int velicinaBroja = velicina.length();
		int produkt = 1;
		int ostatak;
		while (velicinaBroja > 0) {
			ostatak = broj % 10;
			produkt = produkt * ostatak;
			broj = broj / 10;
			velicinaBroja = velicinaBroja - 1;
		}

		return produkt;
	}
/**
 * U ovoj funkciji izracunavamo mult. Otpornost nekog broja.
 * @param broj = bilo koji integeer
 * @return = koeficijent vrijednosti mult. otpornosti
 */
	public static int multOtpornost(int broj) {
		int brojac = 0;
		while ((broj) > 10) {
			proizvod(broj);
			brojac = brojac + 1;
			broj = proizvod(broj);
		}

		return brojac;
	}
/**
 * U ovoj funkciji provjeravamo koeficijente otpornosti  u nekom intervalu.
 * @param broj1 = manji broj intervala ( integer )
 * @param broj2 = veci broj intervala ( integer =
 * @param k = koeficijent MO
 * @return =  brojevi koji imaju mult otpornost koeficijenta "k"
 */
	public static int otpornostInterval(int broj1, int broj2, int k) {
		int i;
		for (i = broj1; i <= broj2; i++) {
			if (multOtpornost(i) == k) {
				System.out.println(i);
			}
		}
		return i;

	}
/**
 * U main funkciji unosimo interval i MO koeficijent. 
 * @param args
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite manj broj");
		int a = in.nextInt();
		System.out.println("Unesite veci broj");
		int b = in.nextInt();
		System.out.println("Unesite koeficijent");
		int k = in.nextInt();
		System.out.println("Brojevi sa multiplikativnom otpornosti " + k
				+ " su: ");
		otpornostInterval(a, b, k);
	}
}
