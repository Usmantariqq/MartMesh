import java.util.ArrayList;

public class Package {

	ArrayList<Items> list = new ArrayList<Items>();


	public void  addItem(Items i)
	{
		
		list.add(i);	    
	}
	float price =0;
	public float getCost()
	{
		for(Items items:list)
		{
			price += items.price();
		}
		return price;
	}
	
	public void showItems()
	{
		for(Items items:list)
		{
			System.out.println("Item " + items.name());
			System.out.println("Price " + items.price());
		}
	}
}
