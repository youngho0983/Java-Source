import java.util.Scanner;

public class Moon4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=1;
		while(num !=0) {
			num=s.nextInt();
			System.out.println( sir(num));
		}
	}
	public static boolean sir(int num) {
		if(num==2) {
			return true;
		}else if(num>=3) {

			for(int i=2;i<num;i++) {
				if(num%i==0) {
					return false;
				}

			}
			return true;
		}

		return false;
	}
}
