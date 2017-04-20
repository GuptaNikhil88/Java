package org.nik.wspractice;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {

	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(args.length != 1){
	System.out.println("you need to pass the IP Adddress");
}
else{
	String ipAddress = args[0];
	//We generate the SEI to callthe service, we generate the stub and call 
	//the service later on the stub
	GeoIPService gips = new GeoIPService();
	GeoIPServiceSoap geoIPServiceSoap =   gips.getGeoIPServiceSoap();
	GeoIP geoIP =  geoIPServiceSoap.getGeoIP(ipAddress);
	System.out.println("Country Name:: "+ geoIP.getCountryName());
	
}
		
	}

}