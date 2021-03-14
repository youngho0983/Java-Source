import java.util.Scanner;

public class ScanningMethods {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String name=s.next();
		
		System.out.println("니이름"+name);
		
		boolean like=s.nextBoolean();
		System.out.println(like);
		
		double tall=s.nextDouble();
		System.out.println(tall);
		
	}
}
