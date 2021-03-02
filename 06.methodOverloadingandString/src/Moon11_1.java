
public class Moon11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDEFGHIJKLMN";
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			builder.append(str.charAt(str.length()-i-1));
		}
		System.out.println(builder);
	}

}
