
public class PackageBuilder {

	public Package getOrganicProducts()
	{
		Package pack = new Package();
		pack.addItem(new BranBread());
		pack.addItem(new OrganicEggs());
		pack.addItem(new WholeWheatFlour());
		pack.addItem(new OrganicMilk());
		return pack;
	}
	
	public Package getWhiteProducts()
	{
		Package pack = new Package();
		pack.addItem(new WhiteBread());
		pack.addItem(new WhiteEggs());
		pack.addItem(new WhiteFlour());
		pack.addItem(new TetraMilk());
		return pack;
	}
}
