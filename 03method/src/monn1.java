import java.util.Scanner;

public class monn1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		add(num1,num2);
		
	}
	
	public static void add(int num1,int num2) {
		System.out.println("두 숫자의 합은 "+(num1+num2));
		System.out.println("두 숫자의 차는"+(num1-num2));
		System.out.println("곱이랑은 제외한다");
	}
}
