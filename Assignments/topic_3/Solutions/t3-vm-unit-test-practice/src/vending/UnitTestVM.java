package vending;

public class UnitTestVM {

	public static void main(String[] args) {
	
		// Drink Unit Tests
		
		Drink drink1 = new Drink("Pepsi", 1.25);
		Drink drink2 = new Drink("Brisk", 2.00);
		
		// Testing Drink.getName()
		testDrinkGetName(drink1, "Pepsi", "Coke");
		testDrinkGetName(drink2, "Brisk", "NesTea");

		// Testing Drink.getPrice()
		testDrinkGetPrice(drink1, 1.25, 0);
		testDrinkGetPrice(drink2, 2.00, 500);
		
		// If above tests pass, constructor for Drink is also correct
		
		// Testing Drink.setName()
		drink1.setName("Pepsi");
		testDrinkSetName(drink1, "Pepsi");
		drink1.setName("Coke");
		testDrinkSetName(drink1, "Coke");
		
		// Testing Drink.setPrice()
		drink2.setPrice(2.00);
		testDrinkSetPrice(drink2, 2.00);
		drink2.setPrice(2.50);
		testDrinkSetPrice(drink2, 2.50);
		
		// VendingMachine Unit Tests
		
		VendingMachine vm = new VendingMachine(500);
		
		// Testing VendingMachine.getNumDrinks()
		testVMgetNumDrinks(vm, 0, 5);
		
		// Testing VendingMachine.getMoney()
		testVMgetMoney(vm, 500, 0);
		
		// Testing VendingMachine.clearMoney()
		vm.clearMoney();
		testVMclearMoney(vm, 0);
		
		// Testing VendingMachine.addMoney()
		vm.addMoney(250);
		testVMaddMoney(vm, 250);
		
		// Testing VendingMachine.addDrink()
		vm.addDrink(drink1);
		testVMaddDrink(vm, 1);
		
		vm.addDrink(drink2);
		testVMaddDrink(vm, 2);
		
		// Testing VendingMachine.removeDrink()
		vm.removeDrink();
		testVMremoveDrink(vm, 1);
		
		// Testing VendingMachine.buyDrink()
		double newTotal = vm.getMoney()+ drink1.getPrice();
		Drink result = vm.buyDrink();
		testVMbuyDrink(vm, result, drink1, newTotal, 0);
		
	}
	
	// Drink Class Tester Methods
	
	// Drink getName() Unit Test
	public static void testDrinkGetName(Drink d, String correctAns, String wrongAns) {
		if (d.getName().equals(correctAns) && !d.getName().equals(wrongAns)) {
			System.out.println("PASSED - Drink getName: " + d.getName() + " == " + correctAns + " && != " + wrongAns);
		} else {
			System.out.println("FAILED - Drink getName: " + d.getName());
		}
	}
	
	// Drink getPrice() Unit Test
	public static void testDrinkGetPrice(Drink d, double correctAns, double wrongAns) {
		if (d.getPrice() == correctAns && d.getPrice() != wrongAns) {
			System.out.println("PASSED - Drink getPrice: " + d.getPrice() + " == " + correctAns + " && != " + wrongAns);
		} else {
			System.out.println("FAILED - Drink getPrice: " + d.getPrice());
		}
	}
	
	// Drink setName() Unit Test
	public static void testDrinkSetName(Drink d, String answer) {
		if (d.getName().equals(answer)) {
			System.out.println("PASSED - Drink setName: " + d.getName() + " == " + answer);
		} else {
			System.out.println("FAILED - Drink setName: " + d.getName());
		}
	}
	
	// Drink setPrice() Unit Test
	public static void testDrinkSetPrice(Drink d, double answer) {
		if (d.getPrice() == answer) {
			System.out.println("PASSED - Drink setPrice: " + d.getPrice() + " == " + answer);
		} else {
			System.out.println("FAILED - Drink setPrice: " + d.getPrice());
		}
	}

	// VendingMachine Class Tester Methods
	
	// VendingMachine getNumDrinks() Unit Test
	public static void testVMgetNumDrinks(VendingMachine v, int correctAns, int wrongAns) {
		if (v.getNumDrinks() == correctAns && v.getNumDrinks() != wrongAns) {
			System.out.println("PASSED - VendingMachine getNumDrinks: " + v.getNumDrinks() + " == " + correctAns + " && != " + wrongAns);
		} else {
			System.out.println("FAILED - VendingMachine getNumDrinks: " + v.getNumDrinks());
		}
	}
	
	// VendingMachine getMoney() Unit Test
	public static void testVMgetMoney(VendingMachine v, double correctAns, double wrongAns) {
		if (v.getMoney() == correctAns && v.getMoney() != wrongAns) {
			System.out.println("PASSED - VendingMachine getMoney: " + v.getMoney() + " == " + correctAns + " && != " + wrongAns);
		} else {
			System.out.println("FAILED - VendingMachine getNumDrinks: " + v.getMoney());
		}
	}
	
	// VendingMachine clearMoney() Unit Test
	public static void testVMclearMoney(VendingMachine v, double answer) {
		if (v.getMoney() == answer) {
			System.out.println("PASSED - VendingMachine clearMoney: " + v.getMoney() + " == " + answer);
		} else {
			System.out.println("FAILED - VendingMachine clearMoney: " + v.getMoney());
		}
	}
	
	// VendingMachine addMoney() Unit Test
	public static void testVMaddMoney(VendingMachine v, double answer) {
		if (v.getMoney() == answer) {
			System.out.println("PASSED - VendingMachine addMoney: " + v.getMoney() + " == " + answer);
		} else {
			System.out.println("FAILED - VendingMachine addMoney: " + v.getMoney());
		}
	}
	
	// VendingMachine addDrink() Unit Test
	public static void testVMaddDrink(VendingMachine v, int answer) {
		if (v.getNumDrinks() == answer) {
			System.out.println("PASSED - VendingMachine addDrink: " + v.getNumDrinks() + " == " + answer);
		} else {
			System.out.println("FAILED - VendingMachine addDrink: " + v.getNumDrinks());
		}
	}
	
	// VendingMachine removeDrink() Unit Test
	public static void testVMremoveDrink(VendingMachine v, int answer) {
		if (v.getNumDrinks() == answer) {
			System.out.println("PASSED - VendingMachine removeDrink: " + v.getNumDrinks() + " == " + answer);
		} else {
			System.out.println("FAILED - VendingMachine removeDrink: " + v.getNumDrinks());
		}
		
	}
	
	// VendingMachine buyDrink() Unit Test
	public static void testVMbuyDrink(VendingMachine v, Drink res, Drink correctDrink, double correctTotal, int correctNum) {
		if (res.equals(correctDrink) && v.getMoney() == correctTotal && v.getNumDrinks() == correctNum) {
			System.out.println("PASSED - VendingMachine buyDrink - New Total: " + v.getMoney() + ", Num Drinks: " + v.getNumDrinks() + ", Drink Purchased: " + res.getName());
		} else {
			System.out.println("FAILED - VendingMachine buyDrink - New Total: " + v.getMoney() + ", Num Drinks: " + v.getNumDrinks() + ", Drink Purchased: " + res.getName());
		}
	}
}
