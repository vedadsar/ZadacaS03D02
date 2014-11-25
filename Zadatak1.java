import java.util.Scanner;

public class Zadatak1 {
/**
 * Ova funkcija ce okrenuti broj i provjeravati da li je jednak sa pocetnim brojem.
 * @param broj bilo koji integer kojeg cemo ispitati da li je simetrican ili ne.
 * @return okrenuti broj.
 */
	public static int isSimetric(int broj) {
		String brojInt = ""+broj;
		int brojac = brojInt.length();
		int brojCopy = broj;
		int ostatak;
		int zbir = 0;
		while (brojac > 0) {
			ostatak = broj % 10;
			zbir = 10 * zbir + ostatak;
			broj = broj / 10;
            brojac = brojac-1;
		}

		if (zbir == brojCopy) {
			System.out.println("Broj je simetrican");
			return zbir;
		} else {
			System.out.println("Broj nije simetrican");
			return zbir;
		}

	}
 /**
  * U main funkciji cemo unositi brojeve i ispitivati da li su simetricni sve dok se ne unese 0.
  * @param args
  */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int unos = 1;
		do{
		System.out.println("Unesite broj");
		 unos = in.nextInt();
		 if(unos == 0){
			 System.out.println("Unijeli ste 0, prekid programa");
			 return;
		 }
	

		isSimetric(unos);
	    } while( unos != 0);
	}

}
