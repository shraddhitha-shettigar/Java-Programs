//Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index

package program_1;
import java.util.ArrayList;
public class Pro1_b5{
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("blue");
		ar.add("Voilet");
		System.out.println(ar);
		int n= ar.size();
		ar.remove(n-1);
		System.out.println(ar);
	}
}
