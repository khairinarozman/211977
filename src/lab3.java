import java.util.Scanner;
public class lab3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int quantity1 = 0;
		int quantity2 = 0;
		double price1 = 0;
		double price2 = 0;
		
		System.out.print("Item 1: " );
		String item1 = sc.nextLine();
		System.out.print("Quantity: ");
		quantity1 = sc.nextInt();
		System.out.print("Unit Price: RM ");
		price1 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("Item 2: ");
		String item2 = sc.nextLine();
		System.out.print("Quantity: ");
		quantity2 = sc.nextInt();
		System.out.print("Unit Price: RM ");
		price2 = sc.nextDouble();
		
		double gov_tax = 0.70;
		double service_charge = 1.16;
		double amount1, amount2, subtotal, total;
		amount1 = quantity1 * price1;
		amount2 = quantity2 * price2;
		subtotal = amount1 + amount2;
		total = subtotal + service_charge + gov_tax;
		
		System.out.println("Item 1: " + item1);
		System.out.println("Quantity: " + quantity1);
		System.out.println("Unit Price: RM " + price1);
		System.out.println("Amount: RM " + amount1);
		
		System.out.println("****************************");
		
		System.out.println("Item 2: " + item2);
		System.out.println("Quantity: " + quantity2);
		System.out.println("Unit Price: RM " + price2);
		System.out.println("Amount: RM " + amount2);
		
		System.out.println("Subtotal: RM " + subtotal);
		System.out.println("Government Tax: RM0.70");
		System.out.println("Service Charge: RM1.16");
		System.out.print("Total: RM " + total);
		
		
	}

}
