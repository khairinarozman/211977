import java.util.Scanner;
public class QuestionC {
	public static void main (String[] args) {
		double retailPrice, taxRate, totalSale;
		
		Scanner sc = new Scanner(System.in);{
			System.out.println("Retail Price (RM) : ");
			System.out.println("Sales Tax Rate (%) : ");
			retailPrice = sc.nextDouble();
			taxRate = sc.nextDouble();
			
			double salesTax;
			
			salesTax = retailPrice * taxRate / 100;
			totalSale = retailPrice + salesTax;
			
			System.out.println("Sales Tax is " + salesTax);
			System.out.println("Total Sale is " + totalSale);
			
			//Author's name: NUR KHAIRINA BINTI ROZMAN
			//Matric number: 211977
			//Lab No: 2
			
		}
		
	}

}
