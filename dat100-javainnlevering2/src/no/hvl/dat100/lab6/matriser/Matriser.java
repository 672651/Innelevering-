package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		for(int[]superduper:matrise){
			for(int superduper2:superduper){
				System.out.print(superduper2 + " "); }
				}
		}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		String johanSinSuperStreng = "";
		for(int i = 0; i < matrise.length; i++) {
			
			for(int z = 0; z < matrise[i].length; z++){
				johanSinSuperStreng = johanSinSuperStreng + matrise[i][z]+" "; }
			johanSinSuperStreng = johanSinSuperStreng + "\n";
			}
		return johanSinSuperStreng;
	}
		
	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		int[][] skaler = new int[matrise[0].length][matrise.length];
		for (int x = 0; x < matrise.length; x++) {
			for (int i = 0; i < matrise[x].length; i++) {
				skaler[x][i] = matrise[x][i]*tall;
			}
		}
		return skaler;
		
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		for (int x = 0; x < b.length; x++) {
			for (int i = 0; i < b[x].length; i++) {
				if (a[x][i] == b[x][i]) {
					return true;
				}
			}
		}
		return false;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
