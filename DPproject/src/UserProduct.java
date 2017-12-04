import java.util.Objects;

public class UserProduct {

	public Items item;
	private String category;
	private String product;

	public UserProduct(String category, String i) {
		this.category = category;
		this.product = i;
		if (Objects.equals(i, "bran bread")) {
			item = new BranBread();
		}
		if (Objects.equals(i, "organic milk")) {
			item = new OrganicMilk();
		}
		if (Objects.equals(i, "white flour")) {
			item = new WhiteFlour();
		}
		if (Objects.equals(i, "shirt")) {
			item = new Shirt();
		}
		if (Objects.equals(i, "jeans")) {
			item = new Jeans();
		}
		if (Objects.equals(i, "trimmer")) {
			item = new Trimmer();
		}
		if (Objects.equals(i, "stand iron")) {
			item = new StandIron();
		}
	}

	public String getCategory() {
		return category;
	}

	public String getProduct() {
		return product;
	}
}
