package training;
import java.util.Scanner;
public class placement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Largest of three nos
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Num1 - "+ num1 +" is the greatest");
		}else if(num2>num3){
			System.out.println("Num2 - "+ num2 +" is the greatest");
		}else {
			System.out.println("Num3 - "+num3 +" is the greatest");
		}
	}

}
