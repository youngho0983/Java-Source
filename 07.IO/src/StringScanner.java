import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		String source="1 5 7";
		Scanner s=new Scanner(source);
		
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		
		int sum=num1+num2+num3;
		
		System.out.printf("%d %d %d   %d",num1,num2,num3,sum);
	}

}
