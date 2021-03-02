
public class OnlyOneInstance {
	public static void main(String[] args) {
		SimpleNumber instance1= SimpleNumber.getInstance();
		System.out.println(instance1);
		System.out.println(instance1.getNum());
		instance1.addNum(20);
		System.out.println(instance1.getNum());
		SimpleNumber instance2=SimpleNumber.getInstance();
		instance2.addNum(30);
		System.out.println(instance2.getNum());
		
		System.out.println(instance1.getNum());
	}
}

class SimpleNumber{
	private static SimpleNumber simpleNumber;
	private int num=0;
	
	private SimpleNumber() {}
	
	public static SimpleNumber getInstance() {
		if(simpleNumber==null) {
			simpleNumber=new SimpleNumber();
			return simpleNumber;
		}else {
			return simpleNumber;
		}
		
	}
	
	public void addNum(int inputNum) {
		num+=inputNum;
	}
	
	public int getNum() {
		return num;
	}
}
