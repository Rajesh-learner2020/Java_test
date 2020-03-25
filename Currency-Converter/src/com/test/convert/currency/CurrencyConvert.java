package com.test.convert.currency;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CurrencyConvert {

	private void convertDenomination(int totalCents, LinkedHashMap<Integer, String> denum ){
		// Convert Calculation

		Set<Integer> denums = denum.keySet();
		Integer[] myArray = new Integer[denums.size()];
		denums.toArray(myArray);

		int[] output = new int[denums.size()];

		for(int i = 0 ; i< denums.size(); i++){

			int currentValue = myArray[i];

			if(currentValue == 1){
				output[i] = totalCents;
				continue;
			}
			output[i] = totalCents / currentValue ;
			totalCents = totalCents % currentValue ;

		}

		// Display output
		for(int i = 0 ; i< output.length; i++){

			if(output[i] == 0){
				continue;
			}
			System.out.println(output[i] + " " + denum.get(myArray[i]));
		}	
	}

	public static void main (String[] args) throws IOException {

		Scanner centInput = new Scanner(System.in);

		System.out.println("Enter a number of cents here: ");
		int  totalCents = centInput.nextInt();	

		Scanner denominationType = new Scanner(System.in);

		System.out.println("Enter currency type: ");
		String  currencyType = denominationType.next();	



		List<String> denumType = new ArrayList<>();
		denumType.add("USD");
		denumType.add("EUR");// Add more types in future


		HashMap<String, Denomination> instanceMap = new HashMap<>();

		instanceMap.put("USD", new DenominationUSA());
		instanceMap.put("EUR", new DenominationEURO()); // create more objects here in future
		Denomination denum = null;
		if(denumType.contains(currencyType)){
			denum = instanceMap.get(currencyType);
			CurrencyConvert cc= new CurrencyConvert();

			cc.convertDenomination(totalCents,denum.getDenominationMap());	
		}else{
			System.out.println("Enter valid denomination type");
		}


	}
}
