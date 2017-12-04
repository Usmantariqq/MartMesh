
public class PlainTShirt implements ITShirt {

	public PlainTShirt()
	{
		System.out.println("plain t shirt");
	}
	
	public void getDesc()
	{
		System.out.println("its a plain t shirt");
	}
	
	public int getPrice()
	{
		return 200;
	}
}
