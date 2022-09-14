package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class O3 {
	
public static void main(String[] args) {
	
	int score = Integer.parseInt(showInputDialog("skriv inn et random tall lul)") );
	
	int tall = 1;
	if (score > 0) {for (int fac = 1; fac <= score; fac++) {tall = tall * fac;} 
	System.out.println(tall);
		
	}
	
}}
	
	

