import java.util.Objects;

public class FactoryProducer {

	
	static	AbsFactory abs;
	
	public static AbsFactory getFactory(String factory)
	{
		if(Objects.equals(factory, "electronic"))
		{
			return (AbsFactory) new ElectronicFactory();
		}
		if(Objects.equals(factory,"food"))
		{
			return (AbsFactory) new FoodFactory();
		}
		if(Objects.equals(factory,"clothing"))
		{
			return (AbsFactory) new ClothingFactory();
		}
		else 
			return null;
	}
}
