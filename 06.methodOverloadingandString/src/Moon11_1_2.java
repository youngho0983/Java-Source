
public class Moon11_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123456-123456";
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!='-') {
				builder.append(str.charAt(i));
			}
		}
		System.out.println(builder);
	}

}
