
public class Moon5 {

	public static void main(String[] args) {
		System.out.println(squ(5));
	}

	public static int squ(int num) {
		if(num==0) {
			return 1;
		}else {
			return 2*squ(num-1);
		}
	}
}
