
public class FruitSalesMain2 {

	public static void main(String[] args) {
		FruitSeller2 seller1 =new FruitSeller2(0, 30,1500);
		FruitSeller2 seller2 =new FruitSeller2(0, 20, 1000);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 현재 상황");
		seller1.showAleResult();
		
		System.out.println("과일 판매자2의 현재 상황");
		seller2.showAleResult();
	}
	
}



class FruitSeller2{
	int numOfApple;
	int myMoney;
	int APPLE_PRICE;
	
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("시부럴 인잇");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("파이널라이즈");
		super.finalize();
	}
	public int saleApple(int money) {
		int saledAppleNum=money/APPLE_PRICE;
		
		numOfApple-=saledAppleNum;
		myMoney+=money;
		return saledAppleNum;
	}
	public void showAleResult() {
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익:"+myMoney);
	}
	
	public FruitSeller2(int money,int appleNum, int price) {
		myMoney=money;
		numOfApple=appleNum;
		APPLE_PRICE=price;
	}
}






class FruitBuyer2{
	int myMoney=10000;
	int numOfApple=0;
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}