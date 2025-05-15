//Develop a java program for performing various string operations with different string handling functions directed as follows String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package program_2;
public class Pro_2a {
	public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "AIET";
        String str2 = new String("Welcome to AIET");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str2: " + str2.length());
        System.out.println("Character at index 5 in str2: " + str2.charAt(5));

        // 3. String Comparison
        String str3 = "AIET";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'to' in str2: " + str2.indexOf("to"));
        System.out.println("str2 contains 'Welcome'? " + str2.contains("Welcome"));

        // 5. Substring Operations
        System.out.println("Substring of str2 (0 to 7): " + str2.substring(0, 7));

        // 6. String Modification
        System.out.println("Replace 'AIET' with 'Alvas' in str2: " + str2.replace("AIET", "Alvas"));
        System.out.println("Convert str2 to lowercase: " + str2.toLowerCase());
        System.out.println("Convert str2 to uppercase: " + str2.toUpperCase());

        // 7. Whitespace Handling
        String strWithSpaces = "   Hello AIET   ";
        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("After trim(): '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String firstName = "Shraddhitha";
        String lastName = "Shettigar";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        // 9. String Splitting
        String csv = "AIET,Engineering,Moodbidri";
        String[] parts = csv.split(",");
        System.out.println("Splitted parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" AIET");
        sb.insert(5, " to");
        sb.replace(0, 5, "Welcome");
        sb.delete(0, 3);
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String dept = "CSE";
        int year = 3;
        String formatted = String.format("Department: %s, Year: %d", dept, year);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email with contains(), startsWith(), endsWith()
        String email = "student@aiet.edu.in";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".edu.in")) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}