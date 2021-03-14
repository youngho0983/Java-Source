
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		for(int i: arr) {
			System.out.println(i);
		}
		
		int[][] brr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] temp:brr) {
			for(int i:temp) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
