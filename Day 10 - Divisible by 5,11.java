package training;
import java.util.Scanner;
public class placement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to check div by 5 and 11");
		int num = sc.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.print("Divisible");
		}else {
			System.out.print("Not divisible");
		}
	}

}
