//Write a java program for getting different colors through ArrayList interface and search whetherthe color "Red" is available or not ( Hint : Use ArrayListObj.contains() )


package program_1;
	import java.util.*;
	public class Pro1_b1 {
		public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Orange");
		ar.add("Red");
		ar.add("blue");
		boolean con = ar.contains("Red");
		System.out.println(con);
		}
	}
