import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GitHubClass {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Bogati");
		cars.remove(2);
		Collections.sort(cars);
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));

		}
		    System.out.println("============");

		ArrayList<Integer> MyNumber = new ArrayList<Integer>();
		MyNumber.add(15);
		MyNumber.add(17);
		MyNumber.add(60);
		MyNumber.add(10);
		Collections.sort(MyNumber);
		for (int i = 0; i < MyNumber.size(); i++) {
			System.out.println(MyNumber.get(i));
		}
	}

}
