//Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package program_1;
import java.util.*;
public class Pro1_c1 {
	public static void main(String[] args) {
		LinkedList<String> l= new LinkedList<>();
		l.add("Apple");
		l.add("banana");
		l.add("Orange");
		l.add("Mango");
		l.add("Guava");
		Iterator a = l.listIterator(2);
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}
}

