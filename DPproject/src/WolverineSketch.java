
public class WolverineSketch extends DecorateTShirt{
	
	public WolverineSketch(ITShirt temp)
	{
		super(temp);
		System.out.println("Printing wolverine sketch");
		
	}
	@Override
	public void getDesc() {
		//System.out.println("");
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.temp.getPrice() + 100;
	}

}
