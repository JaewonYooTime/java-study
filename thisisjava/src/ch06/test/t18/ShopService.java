package ch06.test.t18;

public class ShopService {
	private static ShopService instance = new ShopService();
	
	public static ShopService getInstance() {
		return instance;
	}
}
