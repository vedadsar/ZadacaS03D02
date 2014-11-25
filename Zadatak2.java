/**
 * Napišite funkciju koja kao parametar prima neki string i koja vraæa logièku vrijednost

“taèno” ili “netaèno” u ovisnosti da li u stringu koji je proslijeðen kao parametar ima 

jednakih znakova ili ne. Napišite i kratki testni program u kojem æete demonstrirati 

kako se poziva napisana funkcija i kako se može iskoristiti njen rezultat.
 */

import java.util.Scanner;
public class Zadatak2 {
/**
 * Funkcija uzima rijec ( string ) i provjerava da li string ima duplih karaktera.
 * @param rijec= String, rijec koju ce korisnik unijeti.
 * @return = null.
 */
	public static String str( String rijec){
		String prazno = "";
		String novaRijec;
		int brojac = 0;
		
		for(int i=0; i<=rijec.length()-1;i++){
			
			for( int j=i+1; j<=rijec.length()-1;j++){
				if(rijec.charAt(i) == rijec.charAt(j)){
					brojac =brojac + 1;}
		}
	
		}
			if(brojac > 0){
				System.out.println("Rijec koju ste unijeli ima duplih slova");
			}
			else{
				System.out.println("Rijec koju ste unijeli nema duplih slova");
			}
	
	return null;
	}
	
	/**
	 * U main funkciji unosimo nasu rijec i pozivamo str funkciju koja provjerava da li rijec ima duplih slova.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	   
		System.out.println("Unesite jednu rijec");
		String unos = in.next();
		str(unos);
	}
}
