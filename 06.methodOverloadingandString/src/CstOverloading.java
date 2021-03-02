class Person{
	private int perID;
	private int milID;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	public Person(int perID,int milID, int bYear, int bMonth, int bDay) {
		this.perID=perID;
		this.milID=milID;
		birthYear=bYear;
		birthMonth=bMonth;
		birthDay=bDay;
	}
	public Person(int pID,int bYear, int bMonth, int bDay) {
		this(pID,0,bYear,bMonth,bDay);
		
	}
	public void showInfo() {
		System.out.println("아이구 아무튼 어쩌구");
	}
}


public class CstOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person man=new Person(123456,1234,123,12,1);
		Person woman=new Person(1234,123,12,1);
		
	}

}
