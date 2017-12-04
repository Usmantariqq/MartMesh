
public abstract class DecorateTShirt implements ITShirt{

	
ITShirt temp;
	
	public DecorateTShirt(ITShirt temp)
	{
		this.temp = temp;
	}
}
