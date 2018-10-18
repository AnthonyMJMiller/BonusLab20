import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BonusLab20 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String enter;
		ArrayList<String> items = new ArrayList<String>(
				Arrays.asList("Cereal", "Juice", "Milk", "Apple", "Bread", "Water", "Eggs", "Orange"));
		ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(5.00, 3.00, 1.99, 0.50, 1.00, 1.35, 4.32, 0.35));
		ArrayList<String> itemSelect = new ArrayList<>();
		ArrayList<Double> costItem = new ArrayList<>();
		
		do {
		System.out.println("Welcome to Guenther's Market!");
		
		do {
		System.out.printf("%-15s%s%n%-15s%n", "items", "prices", "=====================");
		showAvailableItems(prices, items);

		for (int i = 0; i < items.size(); i++) {
			for (int j = 0; j < prices.size(); j++) {

			}
		}
		
			int choice = Validator.getInt(key, "Enter an item you wish to add to the cart (choose from numbers 1-8): ",
					1, items.size());
			itemSelect.add(items.get(choice - 1));
			costItem.add(prices.get(choice - 1));

			System.out.println("You've added the following item to cart: " + itemSelect + " " + costItem + ".");
			System.out.println("Would you like to pick another item? (Y/N): ");
			enter = key.next();
			while (!enter.equalsIgnoreCase("Y") && !enter.equalsIgnoreCase("N")) {
				System.out.println("Error! Please enter 'Y' or 'N'.");
				enter = key.next();
			}
			if (enter.equalsIgnoreCase("N")) {
				break;
			}
		} while (enter.equalsIgnoreCase("Y"));
		
		System.out.println("Here's what you have selected: ");
		for (int i = 0; i < itemSelect.size(); i++) {
			for (int j = 0; j < costItem.size(); j++) {
					
			}
			System.out.printf("%-18s %3.2f %n", (itemSelect.get(i)), (costItem.get(i)));
		}
		
		getHighLowItems(costItem);
		
		System.out.printf(getAverage(costItem) + " is the average cost of all your items in your cart.\n");
		System.out.println("Do you want to shop again? (Y/N): ");
		
		enter = key.next();
		while (!enter.equalsIgnoreCase("Y") && !enter.equalsIgnoreCase("N")) {
			System.out.println("Error! Please enter 'Y' or 'N'.");
			enter = key.next();
		}
		if (enter.equalsIgnoreCase("N")) {
			break;
		}
		
		} while (enter.equalsIgnoreCase("Y"));
		
		System.out.println("Thanks for shopping at Guenther's! Have a great day!");
	}

	public static void showAvailableItems(ArrayList<Double> d, ArrayList<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.printf("%-15s%-15.2f%n", (i + 1) + "." + s.get(i), d.get(i));
		}

	}

	public static void getHighLowItems(ArrayList<Double> price) {
		double highPrice = Collections.max(price);
		double lowPrice = Collections.min(price);

		System.out.println("The highest priced item in your cart is " + highPrice + ", and the lowest priced item is "
				+ lowPrice + ".");
	}

	public static Double getAverage(ArrayList<Double> price) {
		double sum = 0.0;
		for (int i = 0; i < price.size(); i++) {
			sum += price.get(i);
		}
		double average = sum / price.size();

		return average;
	}

}
