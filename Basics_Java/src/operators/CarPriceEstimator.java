package operators;

import java.time.LocalDate;

public class CarPriceEstimator {
	
	public double getSalePrice(String makeAndModel, int yearManufactured, double milesDriven, 
			int airBagsCount, boolean hasAbs, boolean hasEbd,
			boolean hasRearViewCamera, boolean hasSunRoof, boolean hasAutoAC,
			boolean hasAccidentHistory) {
		
		double salePrice = getPrice(makeAndModel, yearManufactured);
		int currentYear = LocalDate.now().getYear();		
		int ageOfCar = currentYear - yearManufactured + 1;
		System.out.println("ageOfCar: " +  ageOfCar);
		
			
		// 1. Compute based on yearly depreciation value:
		//       if age of car is less than or equal to 10 then
		//               price depreciates by 5% of original sale price every year
		//               e.g., if original price is 10000, then for 3 year old car
		//                     price depreciated would be 1500, i.e., sale price would be 8500
		//       else 
		//               return salePrice * 0.1 (i.e., 10% of current salePrice)
		// Note: Use compound arithmetic assignment operators
		
		if(ageOfCar <= 10) {
			salePrice = salePrice - (ageOfCar * salePrice * 0.05);
		} else {
			return salePrice * 0.1;
		}
		
		
		System.out.println("salePrice after depreciation: " + salePrice);
		
		
		// 2. Security Features
		//      if car does NOT have atleast two airbags AND abs AND ebd
		//              then reduce price by $1000
		if(!(airBagsCount >= 2 && hasAbs && hasEbd)) {
			salePrice -= 1000;
		}
		
		
		System.out.println("salePrice after accounting for security features: " + salePrice);
		
		// 3. Comfort Features
		// if car has rear-view camera AND either sunroof OR auto AC then
		//    increment price by $500
		if(hasRearViewCamera && (hasSunRoof || hasAutoAC)) {
			salePrice += 500;
		}
	
		
		System.out.println("salePrice after accounting for comfort features: " + salePrice);
		
		// 4. Past accidents
		// if car was involved in an accident then
		//     reduce price by $500
		if(hasAccidentHistory) {
			salePrice -= 500;
		}
		
		
		System.out.println("salePrice after accounting for past accidents: " + salePrice);
		
		// 5. Based on additional miles driven
		double expectedMilesDriven = ageOfCar * 10000.0;
		double additionalMiles = milesDriven - expectedMilesDriven;
		
		// a) if # miles over-driven is greater than 1000 AND less than or equal to 10000 then
		//        reduce sale price by 500
		
		if(additionalMiles > 1000 && additionalMiles <= 10000) {
			salePrice -= 500;
		}
		
		
		// b) if # miles over-driven is greater than 10000 AND less than or equal to 30000 then
		//        reduce sale price by 1000
		if(additionalMiles > 10000 && additionalMiles <= 30000) {
			salePrice -= 1000;
		}
		
		
		// c) if # miles over-driven is greater than 30000 then
		//        reduce sale price by 1500
		if(additionalMiles > 30000) {
			salePrice -= 1500;
		}
		
		System.out.println("salePrice after accounting for miles driven: " + salePrice);
		
		return salePrice;
	}
	
	private double getPrice(String makeAndModel, int yearManufactured) {
		if (makeAndModel.equalsIgnoreCase("ford ecosport")) {
			return 20000.0;
		} else if (makeAndModel.equalsIgnoreCase("honda city")) {
			return 25000.0;
		} else if (makeAndModel.equalsIgnoreCase("toyota camry hybrid")) {
			return 30000.0;
		}
		return 20000.0;
	}

	public static void nonmain(String[] args) {
		CarPriceEstimator carPriceEstimator = new CarPriceEstimator();
		double salesPrice = carPriceEstimator.getSalePrice("ford ecosport", 2018, 60000.0, 2, true, false, true, false, false, true);		
	}
}
