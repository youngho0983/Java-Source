
public class Moon3 {
	public static void main(String[] args) {
		
		System.out.println("반지름 3 의 둘레"+radi(3));
		System.out.println("방지름 3 의 넓이"+area(3));
		
	}
	
	public static double radi(int ra) {
		return ra*2*Math.PI;
	}
	public static double area(int ra) {
		return ra*ra*Math.PI;
	}
}
