import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;

import org.omg.CORBA.Object;

public class Test {

	public static void main(String[] args) throws IOException {

		System.out.println("*******************Welcome To Rainbow Mart****************");
        System.out.println("Enter 1 to build your cart");
		System.out.println("Enter 2 To buy Deal");
		System.out.println("For single product price price 3");
		System.out.println("Press 4 For printing t shirts");

		Scanner scan = new Scanner(System.in);
		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(input);
		int read = scan.nextInt();

		if (read == 1) {
			ArrayList<String> arr = new ArrayList<String>();
			int exit = 1;
			while (exit == 1) {
				System.out.println("Enter category name");
				String a = reader.readLine();
				System.out.println("Enter product name");
				String b = reader.readLine();

				if (Objects.equals(a, "electronic")) {
					AbsFactory fac = FactoryProducer.getFactory(a);
					IElectronics elec = fac.getelectronicitems(b);
					arr.add(elec.name());
				}
				if (Objects.equals(a, "food")) {
					AbsFactory fac = FactoryProducer.getFactory(a);
					IFood food = fac.getfooditems(b);
					arr.add(food.name());
				}
				if (Objects.equals(a, "clothing")) {
					AbsFactory fac = FactoryProducer.getFactory(a);
					IClothing clo = fac.getclothingitems(b);
					arr.add(clo.name());
				}
				System.out.println("Enter 0 to exit or 1 to continue");
				exit = scan.nextInt();

			}
           System.out.println("Your Cart items");
			for (String s : arr) {
				System.out.println(s);
			}
			
			System.out.println("Total");
			
			
		}

		if (read == 3) {
			Chain chainfood = new Food();
			Chain chainelectronic = new Electronic();
			Chain chaincloths = new Clothing();

			chainfood.setNextChain(chainelectronic);
			chainelectronic.setNextChain(chaincloths);
			System.out.println("Enter category name");
			String a = reader.readLine();
			System.out.println("Enter product name");
			String b = reader.readLine();

			UserProduct request = new UserProduct(a, b);
			if (Objects.equals(a, "clothing")) {
				chaincloths.getPrice(request);
			}

			if (Objects.equals(a, "food")) {
				chainfood.getPrice(request);
			}
			// chainfood.getPrice(request);
			if (Objects.equals(a, "electronic")) {
				chainelectronic.getPrice(request);
			}

		}
		if (read == 2) {
			System.out.println("Please Enter  1 for Organic Products Package ");
			System.out.println("       Enter  2 for White Products Package   ");

			int a = scan.nextInt();
			if (a == 1) {
				PackageBuilder pb = new PackageBuilder();
				Package organic = pb.getOrganicProducts();
				System.out.println("Organic Products");
				organic.showItems();

				System.out.println("ToTal " + organic.getCost());
			} else {
				PackageBuilder pb = new PackageBuilder();
				Package white = pb.getWhiteProducts();
				System.out.println("White Products");
				white.showItems();

				System.out.println("ToTal " + white.getCost());
			}
		}
		if (read == 4) {

			System.out.println("enter sketch name");
			String aa = reader.readLine();
			System.out.println(aa);
			if (Objects.equals(aa, "wolverine fast8")) {
				ITShirt shirt = new WolverineSketch(new Fast8Sketch(new PlainTShirt()));
				System.out.println(shirt.getPrice());
			}
			if (aa == "fast8") {
				ITShirt shirt = new Fast8Sketch(new PlainTShirt());
				System.out.println(shirt.getPrice());
			}
			if (aa == "wolverine") {
				ITShirt shirt = new WolverineSketch(new PlainTShirt());
				System.out.println(shirt.getPrice());
			}
		}

	}
}
