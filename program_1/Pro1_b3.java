//Write a java program for getting different colors through ArrayList interface and sort themusing Collections.sort( ArrayListObj)

package program_1;
import java.util.*;
public class Pro1_b3 {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("blue");
		ar.add("Voilet");
		Collections.sort(ar);
		System.out.println(ar);
		}
	}
