import java.util.Objects;

public class ClothingFactory extends AbsFactory{

	@Override
	IElectronics getelectronicitems(String electric_items) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IFood getfooditems(String food) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IClothing getclothingitems(String s) {
		// TODO Auto-generated method stub
		
		if(Objects.equals(s, "jeans"))
		{
		   return	 new Jeans();
		
		}
		if(Objects.equals(s, "shirt"))
		{
			return new Shirt();
		}
		
		
		else 
		return null;
	}

	
	
}
