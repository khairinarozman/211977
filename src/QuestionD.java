import java.util.Scanner;
public class QuestionD {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 0 and 1000: ");
		
		int num = sc.nextInt();
		
		int n1 = 1 + (num - 100) / 100;
		int n2 = (1 + (num - 10) / 10) % 10;
		int n3 = num % 10;
		
		int sum = n1 * n2 * n3;
		
		System.out.println(sum);
		
		//Author's name: NUR KHAIRINA BINTI ROZMAN
		//Matric number: 211977
		//Lab No: 2
		
	}
}
