import java.util.Scanner;

public class Zadatak3 {

	/**
	 * U ovoj funkciji cemo uzeti okrenuti parni ili neparni broj te ga jos
	 * jednom okrenuti da bi dobili cifre pravilnim redosljedom.
	 * 
	 * @param broj
	 *            = bilo koji integer kojeg cemo koristit za unos.
	 * @param parnost
	 *            = boolean true ili false, True za parne, false za neparne
	 * @return = parni ili neparni brojevi, zavisno od booleana.
	 */
	public static int podBroj(int broj, boolean parnost) {
		int zbir = 0;
		if (parnost) {// Ukoliko je boolean parnost = true, pozivamo parnu
						// funkciju i okrecemo cifre.
			int broj1 = parni(broj);
			String velicina = "" + broj1;

			int ostatak;
			int velicinaBroja = velicina.length();
			while (velicinaBroja > 0) {
				ostatak = broj1 % 10;
				zbir = 10 * zbir + ostatak;
				broj1 = broj1 / 10;
				velicinaBroja = velicinaBroja - 1;
			}
			System.out.println(zbir);

		}

		if (!parnost) { // //Ukoliko je boolean parnost = false, pozivamo
						// neparnu funkciju i okrecemo cifre.
			int broj1 = neparni(broj);
			String velicina = "" + broj1;
			int ostatak;
			int velicinaBroja = velicina.length();
			while (velicinaBroja > 0) {
				ostatak = broj1 % 10;
				zbir = 10 * zbir + ostatak;
				broj1 = broj1 / 10;
				velicinaBroja = velicinaBroja - 1;
			}

			System.out.println(zbir);
		}

		return zbir;

	}

	/**
	 * U ovoj funkciji cemo uzimati samo neparne brojeve. Zbog koristenja %,
	 * dobit cemo ih okrenutim redosljedom.
	 * 
	 * @param broj
	 *            Integer koji cemo koristiti za unos.
	 * @return = Okrenutim redosljedom neparni brojevi samo ( parni su
	 *         ignorisani)
	 */
	public static int neparni(int broj) {
		String velicina = "" + broj;
		int velicinaBroja = velicina.length();
		int zbir = 0;
		int ostatak;
		while (velicinaBroja > 0) {
			if (broj % 2 != 0) {
				ostatak = broj % 10;
				zbir = 10 * zbir + ostatak;
				broj = broj / 10;
				velicinaBroja = velicinaBroja - 1;
			}

			if (broj % 2 == 0) {
				broj = broj / 10;
				velicinaBroja = velicinaBroja - 1;
			}

		}

		return zbir;

	}

	/**
	 * U ovoj funkciji cemo uzimati samo parne brojeve. Zbog koristenja %, dobit
	 * cemo ih okrenutim redosljedom.
	 * 
	 * @param broj
	 *            = bilo koji integer koji cemo koristi za unos.
	 * @return = samo parni brojevi okrenutim redosljedom ( neparni ignorisani)
	 */
	public static int parni(int broj) {
		String velicina = "" + broj;
		int velicinaBroja = velicina.length();
		int zbir = 0;
		int ostatak;
		while (velicinaBroja > 0) {
			if (broj % 2 == 0) {
				ostatak = broj % 10;
				zbir = 10 * zbir + ostatak;
				broj = broj / 10;
				velicinaBroja = velicinaBroja - 1;
			}

			if (broj % 2 != 0) {
				broj = broj / 10;
				velicinaBroja = velicinaBroja - 1;
			}

		}

		return zbir;
	}

	/**
	 * U main funkciji cemo unositi broj, te birati true ( parni ) ili false (
	 * neparni). U zavisnosti od izbora pozivamo funkciju.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int unos = 1;
		while (unos != 0) {

			System.out.println("Unesite broj");
			unos = in.nextInt();
			if (unos == 0) {
				System.out.println("Unijeli ste nulu, prekid programa");
				return;
			}
			System.out
					.println("Unesite parnost ( true za paran ) ili ( false za neparan)");
			boolean parnost = in.nextBoolean();

			if (parnost) {
				podBroj(unos, true);
			}
			if (!parnost) {
				podBroj(unos, false);
			}
		}
	}

}
