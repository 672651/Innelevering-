package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26 
	
	private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		// TODO
		// OPPGAVE - START
		String word = "2017-08-13T08:52:26.000Z";
		String sub1 = word.substring(11,13);
		String sub2 = word.substring(14,16);
		String sub3 = word.substring(17,19);
		
		System.out.print(sub1);
		System.out.print(sub2);
		System.out.print(sub3);
		
		hr = Integer.parseInt(sub1);
		min = Integer.parseInt(sub2);
		sec = Integer.parseInt(sub3);
		
		secs = hr * 60 * 60 + min *60 + sec;
		
		return secs;

		// OPPGAVE - SLUTT
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;

		// TODO - START ;
		
		gpspoint = new GPSPoint(toSeconds(timeStr), Double.parseDouble(latitudeStr), Double.parseDouble(longitudeStr), Double.parseDouble(elevationStr));
		
		return gpspoint;
		
		
		// OPPGAVE - SLUTT ;
	    
	}
	
}
