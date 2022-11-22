package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String tekst = "";
		for (int i = 0; i<tabell.length; i++) {
			tekst += tabell[i]+",";
		}
		tekst = "["+tekst+"]";
		return tekst;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int a = 0;
		int summer = 0;
		int q = 0;
		int x = 0;
		for (int i = 0; i<tabell.length; i++) {
			summer = summer+tabell[i];	
		}
		while (q < tabell.length ) {
			a = a+tabell[q];
			q++;
		}
		for (int b:tabell) {
			x = x+b;
		}
		return a;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for (int i = 0; i<tabell.length; i++) {
			if (tall==tabell[i]) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int posisjon = 0;
		for (int i = 0; i<tabell.length; i++) {
			if (tall==tabell[i]) {
				posisjon = i; 
				return posisjon;
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int [] reverse = new int[tabell.length];
		int q = tabell.length;
		for (int i = 0; i < tabell.length; i++) {
			reverse[q-1] = tabell[i];
			q--;
		}
		return reverse;
		
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i = 0; i < tabell.length-1; i++) {
			if (tabell[i]>tabell[i+1]) {
				return false;
			}
			
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int x = 0;
		int[] newTabell = new int [tabell1.length + tabell2.length];
		for(int i = 0; i<tabell1.length; i++) {
			
			newTabell[x] = tabell1[i];
			x++;
		}
		for(int q = 0; q<tabell2.length; q++) {
			newTabell[x] = tabell2[q];
			x++;
			}
		return newTabell;
	}
}
