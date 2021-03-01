
public class HelloStatic {

	public static void main(String[] args) {
		InstCnt ins1=new InstCnt();
		InstCnt ins2=new InstCnt();
		InstCnt ins3=new InstCnt();
		System.out.println(ins1.instNum);
		ins1.instNum=2;
		System.out.println(ins2.instNum);
		InstCnt.instNum=10;
		System.out.println(ins2.instNum);
	}

}

class InstCnt{
	static int instNum=0;
	
	public InstCnt() {
		instNum++;
		System.out.println("인스턴스 생성 :"+instNum);
	}
}



