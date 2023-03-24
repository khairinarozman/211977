import java.util.Scanner;
public class QuestionA {
	public static void main (String[] args) {
		double miles;
		
		Scanner sc = new Scanner (System.in);{
			System.out.println("Please enter miles:");
			miles = sc.nextDouble();
			
			double kilometers = miles * 1.6;
			
			System.out.println(kilometers);
			System.out.println(String.format("%.2f", kilometers) + ("Kilometres"));
			
			//Author's name: NUR KHAIRINA BINTI ROZMAN
			//Matric number: 211977
			//Lab No: 2
		}
	}

}
