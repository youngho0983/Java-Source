
public class MethodDefAdd {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("프로그램 종료");
	}
	
	public static void hiEveryone(int num) {
		System.out.println("좋은 아침입니다.");
		System.out.println("저의 나이는 "+num+"입니다");
	}
}
