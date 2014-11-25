import java.util.Scanner;

public class Zadatak7 {
/**
 * Fukncija generise 5 random brojeva i poziva boolean funkciju da odluci da li je broj paran ili ne.
 * @param broj1 = manji broj intervala. (INTEGER )
 * @param broj2 = veci broj intervala. (INTEGER)
 * @return = vraca 5 integer nasumicnih brojeva.
 */
	public static int random(int broj1, int broj2) {
		int brojac = 0;
		int broj = 0;
		while (brojac < 5) {
			broj = (int) (broj1 + Math.random() * (broj2 - broj1 + 1));

			if (jeParan(broj)) {
				System.out.println("Random broj je " + broj + ", paran");
				brojac = brojac + 1;
			}
			if (!jeParan(broj)) {
				System.out.println("Random broj je " + broj + ", neparan");
				brojac = brojac + 1;
			}

		}
		return broj;

	}
 /**
  * Boolean funkcija vraca vrijednost true ukoliko je broj iz funkcije random paran,
  * tj vrijednost false ako je broj neparan.
  * @param broj = bilo koji integer iz random intervala.
  * @return = true ili false, tj paran ili neparan broj.
  */
	public static boolean jeParan(int broj) {
		boolean paran = true;
		if (broj % 2 == 0) {
			paran = paran;
		}
		if (broj % 2 != 0) {
			paran = !paran;
		}
		return paran;
	}
/**
 * U main funkciji unosimo vrijednosti intervala, i zatim pozivamo random funkciju.
 * @param args
 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Unesite manj broj");
		int a = in.nextInt();
		System.out.println("Unesite veci broj");
		int b = in.nextInt();
		
		random(a, b);
	}

}
