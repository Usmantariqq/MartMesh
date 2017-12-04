import java.util.Objects;

public class Electronic implements Chain {

	private Chain nextInChain;

	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
	}

	public void getPrice(UserProduct request) {
		if (Objects.equals(request.getCategory(), "electronic")) {
			System.out.println(request.getProduct() + request.item.price());
		} else
			nextInChain.getPrice(request);
	}
}
