import java.util.Objects;

public class Clothing implements Chain {

	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}

	public void getPrice(UserProduct request) {
		if (Objects.equals(request.getCategory(), "clothing")) {
			System.out.println(request.getProduct() + request.item.price());
		} else
			System.out.println("You have entered wrong category");
		
	}
}
