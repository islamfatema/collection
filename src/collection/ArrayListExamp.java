package collection;
import java.util.ArrayList;
public class ArrayListExamp {

	public static void main(String[] args) {
		ArrayList<Integer> inte= new ArrayList<Integer>();
		System.out.println("array " +inte);
		inte.add(5);
		inte.add(1);
		inte.add(-6);
		
		System.out.println("The array size is " +inte.size());
		System.out.println("The 3rd index is " +inte.get(2));
		
		inte.add(1, 8);
		System.out.println("The array size is " +inte.size());
		System.out.println("The 3rd index is " +inte.get(2));
		inte.remove(0);
		System.out.println("The array size is " +inte.size());
		System.out.println("The 1st index is " +inte.get(0));
		int index=inte.indexOf(-6);
		System.out.println("The index of -6 is " +index);
		inte.clear();
		System.out.println("The array size is " +inte.size());
	}

}
