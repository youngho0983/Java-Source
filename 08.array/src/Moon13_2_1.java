
public class Moon13_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5},{7,8,9}};
		add(arr,10);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	
	}
	private static void add(int[][] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]+=num;
			}
		}
		
	}
}
