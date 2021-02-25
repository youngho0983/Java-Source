
public class ReculFactorial {

	public static void main(String[] args) {
		System.out.println("4 factorial:"+factorial(4));
		
	}
	public static int factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}

}
