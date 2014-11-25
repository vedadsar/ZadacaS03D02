import java.util.Scanner;

public class Zadatak6 {
/**
 * Funkcija provjerava da li je neki broj djeljiv sa 5,7 ili 11.
 * One koji su djeljivi ispisuje od najveceg ka najmanjem
 * @param broj = bilo koji intgere, koristit cemo unos.
 * @return = brojevi djeljivi sa 5,7 ili 11.
 */
	public static int jeDjeljiv(int broj) {
		int i;
		for (i = broj; i >= 1; i--) {
			if (i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {
				System.out.println(i);
			}
		}

		return i;
	}
/**
 * U main funkciji biramo broj do kojeg nam interval ide. Zatim pozivao funkciju jeDjeljiv.
 * @param args
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite  broj");
		int unos = in.nextInt();
		jeDjeljiv(unos);
	}
}
