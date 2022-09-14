package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class InnleveringO2 {
	
public static void main(String[] args) {
		
		int score = Integer.parseInt(showInputDialog("skriv inn din karakter i % ;)") );
		
		if (score > 90 && score < 100) {
			System.out.println("Din karakter er A");
		}	
		else if (score > 80 && score < 89) {
			System.out.println("Din karakter er A");	
		}
		else if (score > 60 && score < 79) {
			System.out.println("Din karakter er C");
		}
		else if (score > 50 && score < 59) {
			System.out.println("Din karakter er D");
		}
		else if (score > 40 && score < 49) {
			System.out.println("Din karakter er E");
		}
		else if (score > 0 && score < 39) {
			System.out.println("Din karakter er F");
		}
		else if (score <= - 1 && score > 100) {
			System.out.println("Din karakter er ugyldig");
		}
    }
}

