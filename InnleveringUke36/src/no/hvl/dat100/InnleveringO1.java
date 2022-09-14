package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class InnleveringO1 {
	
	public static void main(String[] args) {
		
		int cash = Integer.parseInt(showInputDialog("skriv inn cash ;)") );
		double skatt = 0;
		
		if (cash <= 164100) {
				System.out.println("Du må betale " + skatt + " cash i skatt");
		}
		else if (cash >= 164101 && cash <= 230950) {
			skatt = 0.0093;
			System.out.println("Du må betale " + skatt * cash + " cash i skatt");
		}
		else if (cash >= 320951 && cash <= 580650) {
			skatt = 0.0241;
			System.out.println("Du må betale " + skatt * cash + " cash i skatt");
			
		}
		else if (cash >= 580651 && cash <= 934050) {
			skatt = 0.1152;
			System.out.println("Du må betale " + skatt * cash + " cash i skatt");
			
		}
		else if (cash >= 934051) {
			skatt = 0.1452;
			System.out.println("Du må betale " + skatt * cash + " cash i skatt");
		}
		
	}
}
	
