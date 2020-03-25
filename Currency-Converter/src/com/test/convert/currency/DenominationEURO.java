package com.test.convert.currency;
import java.util.LinkedHashMap;

public class DenominationEURO implements Denomination{
		

	LinkedHashMap<Integer, String> denums ;
		
		public DenominationEURO() {
			// TODO Auto-generated constructor stub
			
			denums = new LinkedHashMap<>();

			denums.put(200, "two euro");
			denums.put(50, "50c");
			denums.put(20,"20c");
			denums.put(10,"10c");
			denums.put(5, "5c");
			denums.put(1,"1c");
		}
		
		public LinkedHashMap<Integer, String> getDenominationMap(){
			return denums;
		}
	
	}
	
