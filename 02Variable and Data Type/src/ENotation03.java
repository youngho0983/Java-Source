
public class ENotation03 {
	public static void main(String[] args) {
		double e1=1.2e-3; // 1.2 *10^-3
		double e2=1.2e+3;// 1.2 * 10^3
		int num1=0xA0E;// 16진수 10 , 0 ,14 => 16^2*10 +16*0+14
		int num2=0752;// 8진수 7  5   2  => 8^2*7 +8&5+2
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(num1);
		System.out.println(num2);
	}
}
