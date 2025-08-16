package training;
import java.util.Scanner;

public class Day13 {
	public static void main(String[] args) {
		System.out.print("Enter number for mult table");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println(n + "*" + i + "=" + n*i);
		}
	}

}
