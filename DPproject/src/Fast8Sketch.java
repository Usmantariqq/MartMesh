
public class Fast8Sketch extends DecorateTShirt{

	public Fast8Sketch(ITShirt temp)
	{
		super(temp);
		System.out.println("Printing Fast 8 sketch");
		
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
