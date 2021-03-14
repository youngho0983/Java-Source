
public class Moon13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,5,2,56,7,8,1};
		System.out.println(minValue(arr));
		System.out.println(maxValue(arr));
	}
	private static int minValue(int[] arr) {
		int result=arr[0];
		for(int i:arr) {
			if(i<result) {
				result=i;
			}
		}
		return result;
	}
	private static int maxValue(int[] arr) {
		int result=arr[0];
		for(int i:arr) {
			if(result<i) {
				result=i;
			}
		}
		return result;
	}
}
