
public class AccessArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		int[] arr2= {1,2,3};
		System.out.printf("%d %d ",arr2[0],arr[0]);
		String[] strArr=new String[3];
		strArr[0]="hello";
		strArr[1]=new String("java");
		strArr[2]="world";
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
			
		}
		
	}

}
