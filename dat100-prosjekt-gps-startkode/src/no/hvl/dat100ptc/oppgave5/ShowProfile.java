package no.hvl.dat100ptc.oppgave5;

import easygraphics.EasyGraphics;
import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSData;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;
import no.hvl.dat100ptc.oppgave2.GPSDataFileReader;
import no.hvl.dat100ptc.oppgave4.GPSComputer;

import javax.swing.JOptionPane;

public class ShowProfile extends EasyGraphics {

	private static final int MARGIN = 50;  // margin on the sides 
	
	private static int MAXBARHEIGHT = 500; // assume no height above 500 meters
	
	private GPSPoint[] gpspoints;

	public ShowProfile() {

		String filename = JOptionPane.showInputDialog("GPS data filnavn: ");
		GPSComputer gpscomputer =  new GPSComputer(filename);

		gpspoints = gpscomputer.getGPSPoints();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		int N = gpspoints.length; // number of data points

		makeWindow("Height profile", 2 * MARGIN + 3 * N, 2 * MARGIN + MAXBARHEIGHT);

		// top margin + height of drawing area
		showHeightProfile(MARGIN + MAXBARHEIGHT); 
	}

	public void showHeightProfile(int ybase) {

		// ybase indicates the position on the y-axis where the columns should start
	
		int x = MARGIN,y;

		// TODO - START
		final int BARWIDTH = 2;
	    
	    int barHeight;
	    
	    double elevation;
	    double minElevation = gpspoints[0].getElevation();

	    for (int i = 1; i < gpspoints.length; i++) {
	      elevation = gpspoints[i].getElevation();

	      if (elevation < minElevation) minElevation = elevation;
	    }

	    if (minElevation < 0) ybase -= Math.abs((int)(minElevation-0.5));

	    for (GPSPoint p : gpspoints) {
	      elevation = p.getElevation();

	      if (elevation < 0) { 
	        barHeight = (Math.abs((int)(elevation-0.5)));
	        y = ybase;
	        
	      } else { 
	        barHeight = ((int)(elevation+0.5));
	        y = ybase - barHeight;
	      }
	      
	      fillRectangle(x, y, BARWIDTH, barHeight);
	      
	      x += (2*BARWIDTH);
	    }
	
		// TODO - SLUTT
	}

}
