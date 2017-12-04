import java.util.Objects;

public class FoodFactory extends AbsFactory {

static IFood food;
	


	public IElectronics getelectronicitems(String s)
	{
		// TODO Auto-generated method stub
		return null;
		 
	}

	public IFood getfooditems(String s) {
		if(Objects.equals(s, "branbread"))
		{
		   return	 new BranBread();
		
		}
		if(Objects.equals(s, "organicmilk"))
		{
			return new OrganicMilk();
		}
		if(Objects.equals(s, "whiteflour"))
		{
			return  new WhiteFlour();
		}
		
		else 
		return null; 
		
	}

	
	public IClothing getclothingitems(String cloths) {
		// TODO Auto-generated method stub
		return null;
	}
}
