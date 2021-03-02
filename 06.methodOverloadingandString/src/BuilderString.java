
public class BuilderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder("hello");
		System.out.println(builder);
		builder.append(25);
		System.out.println(builder);
		builder.append('Y').append(true);
		System.out.println(builder);
		builder.insert(2, false);
		System.out.println(builder);
		builder.insert(builder.length(), 'Z');
		System.out.println(builder);
		
	}

}
