
public class ArrayAndMethod {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] ref;
		
		ref=addAllArray(arr,10);
		
		if(arr==ref)
			System.out.println("같다");
		for(int i=0;i<ref.length;i++) {
			System.out.println(ref[i]);
		}
		System.out.println(ref);
		System.out.println(arr);
	}
	
	public static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0;i<ar.length;i++) {
			ar[i]+=addVal;
			
		}
		return ar;
	}
}
