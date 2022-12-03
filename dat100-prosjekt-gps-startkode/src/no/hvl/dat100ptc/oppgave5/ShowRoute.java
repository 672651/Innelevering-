package no.hvl.dat100ptc.oppgave5;

import javax.swing.JOptionPane;

import easygraphics.EasyGraphics;
import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave3.GPSUtils;
import no.hvl.dat100ptc.oppgave4.GPSComputer;

public class ShowRoute extends EasyGraphics {

	private static int MARGIN = 50;
	private static int MAPXSIZE = 800;
	private static int MAPYSIZE = 800;

	private GPSPoint[] gpspoints;
	private GPSComputer gpscomputer;
	
	public ShowRoute() {

		String filename = JOptionPane.showInputDialog("GPS data filnavn: ");
		gpscomputer = new GPSComputer(filename);

		gpspoints = gpscomputer.getGPSPoints();

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void run() {

		makeWindow("Route", MAPXSIZE + 2 * MARGIN, MAPYSIZE + 2 * MARGIN);

		showRouteMap(MARGIN + MAPYSIZE);
		
		showStatistics();
	}

	// antall x-pixels per lengdegrad
	public double xstep() {

		double maxlon = GPSUtils.findMax(GPSUtils.getLongitudes(gpspoints));
		double minlon = GPSUtils.findMin(GPSUtils.getLongitudes(gpspoints));

		double xstep = MAPXSIZE / (Math.abs(maxlon - minlon)); 

		return xstep;
	}

	// antall y-pixels per breddegrad
	public double ystep() {
	
		double ystep;
		
		// TODO - START
		double maxlat = GPSUtils.findMax(GPSUtils.getLatitudes(gpspoints));
	    double minlat = GPSUtils.findMin(GPSUtils.getLatitudes(gpspoints));

	    ystep = MAPYSIZE / (Math.abs(maxlat - minlat)); 

	    return ystep;

		// TODO - SLUTT
		
	}

	public void showRouteMap(int ybase) {

		// TODO - START
		final int RADIUS = 4;
	    
	    int konvertertLongitude, konvertertLatitude, x, y;
	    
	    double elevation = 0;
	    double maxlon = GPSUtils.findMax(GPSUtils.getLongitudes(gpspoints));
	    double maxlat = GPSUtils.findMax(GPSUtils.getLatitudes(gpspoints));
	    
	    for (GPSPoint p : gpspoints) {
	      konvertertLongitude = (int)(((maxlon-p.getLongitude())*xstep())+0.5);
	      konvertertLatitude = (int)(((maxlat-p.getLatitude())*ystep())+0.5);
	      
	      x = ybase - konvertertLongitude;
	      y = MARGIN + konvertertLatitude;
	      
	      if (p.getElevation() > elevation) {
	        setColor(255, 0, 0);
	        elevation = p.getElevation();
	        
	      } else if (p.getElevation() < elevation) {
	          setColor(0, 255, 0);
	          elevation = p.getElevation();
	          
	        } else setColor(0, 0, 255);
	      
	      fillCircle(x, y, RADIUS);
	    }
		
		// TODO - SLUTT
	}

	public void showStatistics() {

		int TEXTDISTANCE = 20;

		setColor(0,0,0);
		setFont("Courier",12);
		
		// TODO - START
		final double WEIGHT = 80.0;
	    
	    final int X = MAPXSIZE - 240;
	    
	    int y = MARGIN - 25;
	    
	    String str;
	    
	    drawString("==============================================", X, y);
	    y += TEXTDISTANCE;

	    String[][] statisticsWithDescriptions = {
	        {"Total Time", GPSUtils.formatTime(gpscomputer.totalTime()), "hs:mm:ss"},
	        {"Total Distance", GPSUtils.formatDouble(gpscomputer.totalDistance()/1000), "km"},
	        {"Total Elevation", GPSUtils.formatDouble(gpscomputer.totalElevation()), "m"},
	        {"Max Speed", GPSUtils.formatDouble(gpscomputer.maxSpeed()), "km/h"},
	        {"Average Speed", GPSUtils.formatDouble(gpscomputer.averageSpeed()), "km/h"},
	        {"Energy", GPSUtils.formatDouble(gpscomputer.totalKcal(WEIGHT)), "kcal"}
	    };
	    
	    int stringWidth = 0;
	    
	    for (int r = 0; r < statisticsWithDescriptions.length; r++)
	      if (statisticsWithDescriptions[r][0].length() > stringWidth)
	        stringWidth = statisticsWithDescriptions[r][0].length();
	    
	    for (int r = 0; r < statisticsWithDescriptions.length; r++) {
	      str = String.format("%-" + stringWidth + "s", 
	          statisticsWithDescriptions[r][0]);
	      drawString(str, X, y);
	      
	      str = (":" + statisticsWithDescriptions[r][1] + " " +
	          statisticsWithDescriptions[r][2]);
	      drawString(str, (X+(6*stringWidth)), y);
	      
	      y += TEXTDISTANCE;
	    }
	    
	    drawString("==============================================", X, y);
		
		// TODO - SLUTT;
	}

}
