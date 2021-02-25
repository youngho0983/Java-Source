import java.util.Scanner;

public class Moon2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		absol(num1,num2);			
	}
	
	public static void absol(int num1,int num2) {
		int result1=num1-num2;
		if(result1<0) {
			result1=-result1;
		}
		System.out.println(result1);
	}
}
