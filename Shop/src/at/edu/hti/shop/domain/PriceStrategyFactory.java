package at.edu.hti.shop.domain;

public class PriceStrategyFactory {

	public static IPriceStrategy getStrategy(String id) {
		if (id == null || id.isEmpty())
			throw new NullPointerException("id is null");

		//TODO better solution
		if("FreeShipping".equals(id))
		{
			return new FreeShippingStrategy();
		}
		
		if("Default".equals(id))
		{
			return new DefaultStrategy();
		}
		
		
		throw new IllegalArgumentException("id not supported");
	}
}
