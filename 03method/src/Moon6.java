
public class Moon6 {

	public static void main(String[] args) {

		bin(2);
		System.out.println("------");
		bin(3);
		System.out.println("------");
		bin(4);
		System.out.println("------");
		bin(5);
		
	}
	
	public static void bin(int num) {
		if(num ==1) {
			System.out.println(1);
		}else if(num==0) {
			System.out.println(0);
		}else {
			if(num%2==1) {
				bin(num/2);
				System.out.println(1);
			}else {
				bin(num/2);
				System.out.println(0);
			}
		}
	}

}
