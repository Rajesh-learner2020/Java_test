package com.test.convert.currency;
import java.util.LinkedHashMap;

public class DenominationUSA implements Denomination{
		

		LinkedHashMap<Integer, String> denums ;
		
		public DenominationUSA() {
			// TODO Auto-generated constructor stub
			
			denums = new LinkedHashMap<>();

			denums.put(100, "1 Dollar");
			denums.put(25, "Quarter");
			denums.put(10,"Dime");
			denums.put(5, "Nickle");
			denums.put(1,"Cent");
		}
		
		public LinkedHashMap<Integer, String> getDenominationMap(){
			return denums;
		}
	
	}
	
