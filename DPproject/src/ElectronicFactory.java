import java.util.Objects;

public class ElectronicFactory extends AbsFactory {

static IElectronics elctronic;
	
	public IElectronics getelectronicitems(String s)
	{
		
		if(Objects.equals(s, "trimmer"))
		{
		   return	new Trimmer();
		
		}
		if(Objects.equals(s, "standiron"))
		{
			return new StandIron();
		}
		
		else 
		return null;  
	}

	@Override
	IFood getfooditems(String food) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IClothing getclothingitems(String cloths) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
