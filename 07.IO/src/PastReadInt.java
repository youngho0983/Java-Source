import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PastReadInt {

	public static void main(String[] args) {
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("정수 입력");
			String temp=br.readLine();
			int num=Integer.parseInt(temp);
			System.out.println(num);
		}catch(Exception e) {
			e.printStackTrace();			
		}
	}

}
