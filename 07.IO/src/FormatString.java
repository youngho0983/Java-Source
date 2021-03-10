
public class FormatString {

	public static void main(String[] args) {

		int age=20;
		double tall=175.7;
		char t='a';
		String name="자자바~";
		System.out.printf("제 이름은 %s \n",name);
		System.out.printf("나이는 %d 키는 %e \n",age,tall);
		System.out.printf("%d %o %x \n",77,77,77);
		System.out.printf("%g %g \n", 0.00014,0.000014);
		System.out.printf("%s %c",t,t);
	}

}
