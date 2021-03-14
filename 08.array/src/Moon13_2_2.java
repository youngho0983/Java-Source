
public class Moon13_2_2 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		change(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
	}
	
	private static void change(int[][] arr) {
		int temp[]=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		
		
	}

}
