
public class FruitSalesMan1 {
	public static void main(String[] args) {
		FruitSeller seller =new FruitSeller();
		FruitBuyer buyer =new FruitBuyer();
		buyer.buyApple(seller, 2000);
		
		System.out.println("과일 판매자의 현재상황");
		seller.showAleResult();
		System.out.println("과일 구매자의 현재상황");
		buyer.showBuyResult();
	}
}

class FruitSeller{
	int numOfApple =20;
	int myMoney=0;
	final int APPLE_PRICE=1000;
	
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
}
class FruitBuyer{
	int myMoney=5000;
	int numOfApple=0;
	
	public void buyApple(FruitSeller seller, int money) {
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult() {
		System.out.println("현재 잔액:"+myMoney);
		System.out.println("사과 개수:"+numOfApple);
	}
}