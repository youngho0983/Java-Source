
public class Moon131 {

	public static void main(String[] args) {
		int temp[]= {3,4,1,2,3,6,8};
		System.out.println(minValue(temp));
		System.out.println(maxValue(temp));
		
		
	}
	
	public static int minValue(int[] arr) {
		int result=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<result) {
				result=arr[i];
			}
		}
		return result;
	}
	public static int maxValue(int[] arr) {
		int result=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>result) {
				result=arr[i];
			}
		}
		return result;
	}

}
