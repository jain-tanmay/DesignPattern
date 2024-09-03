package AbstractFactory;

public class LuxuryCarFactory implements AbstractFactory {
	@Override
	public Car getInstance(int price) {
		if (price >= 10000000 && price <= 20000000)
			return new LuxuryCar1();
		else if (price > 20000000)
			return new LuxuryCar2();
		return null;
	}
}
