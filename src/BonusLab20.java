import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BonusLab20 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);

		System.out.println("Welcome to Guenther's Market!");

		ArrayList<String> items = new ArrayList<String>(
				Arrays.asList("Cereal:", "Juice:", "Milk:", "Apple:", "Bread:", "Water:", "Eggs:", "Orange:"));
		ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(5.00, 3.00, 1.99, 0.50, 1.00, 1.35, 4.32, 0.35));
		
		System.out.printf("%-15s%s%n%-15s%n", "items", "prices", "=====================");
		showAvailableItems(prices, items); 
	}
	
	public static ArrayList<String> addDisplayCart(ArrayList<String> addItem, Scanner item){
		ArrayList<String> cart = new ArrayList<>();
		for (int i = 0; i < addItem.size(); i++) {
			int choice = Validator.getInt(item, "Enter an item you wish to add to the cart (choose from numbers 1-8): ", 1, addItem.size());
			if(item.hasNextInt()) {
				cart.add(addItem.get(choice - 1));
			}
		}
		
		
		return cart;
	}
	
	public static void showAvailableItems(ArrayList<Double> d, ArrayList<String> s) {
		for (int i = 0; i < s.size(); i++) {
			System.out.printf("%-15s%-15.2f%n", (i + 1) + "." + s.get(i), d.get(i));
		}
		
	}

	
	
}
