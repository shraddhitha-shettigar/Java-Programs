//Write a java program for getting different colors through ArrayList interface and remove the2nd element and color "Blue" from the ArrayList (using remove by index and remove by object)
package program_1;
import java.util.*;
public class Pro1_b2 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("Green");
		ar.add("Blue");
		System.out.println(ar);
		ar.remove(2);
		System.out.println(ar);
		ar.remove("Blue");
		System.out.println(ar);
		}
	}

