package main;

public class FutureSellCallBuy {

	public static void Calculation(int FuturePrice, int CallStrikePrice, int CallPrice, int LotSize, int Duration) {
		int PL = 0;
		int MaxPrice =0;
		int MinPrice = 0;
		
		if(FuturePrice > CallStrikePrice ) {
			MaxPrice = FuturePrice + (Duration*50);
			MinPrice = CallStrikePrice - (Duration*50);
		}
		
		else {
			MinPrice = FuturePrice - (Duration*50);
			MaxPrice = CallStrikePrice + (Duration*50);
		}
		
		for (int expiryPrice = MaxPrice; expiryPrice >= MinPrice ; expiryPrice = expiryPrice- 50) {
			
			int FuturePL = FuturePrice - expiryPrice;
			
			int CallPL = expiryPrice - CallStrikePrice ;
			
			if(CallPL <= 0) {
				 PL = (FuturePrice - expiryPrice - CallPrice) * LotSize;
			}
			
			else {
				PL = (FuturePrice - expiryPrice - CallPrice + CallPL) * LotSize;
			}
			
			System.out.println("For expiry at Strike Price " + expiryPrice + " P&L will be "+ PL);
		}
		
		
	}
	
	public static void main (String Args[]) {
	
		Calculation(34700,34800,100,25,10);
	}
}
