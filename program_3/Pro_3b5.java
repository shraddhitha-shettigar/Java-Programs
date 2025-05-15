//Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()

package program_3;
public class Pro_3b5 {
	public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll(" ", "");
    }
	public static void main(String[] args) {
		  System.out.println(removeWhitespace(" Hello World ")); 
	}

}
