package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class IteratorInJava {

	public static void main(String[] args) {
		  List<Object> vector1=new LinkedList<Object>();
          vector1.add(Integer.valueOf(10));
          vector1.add(20);
          vector1.add(30);
          vector1.add(true);
          vector1.add(String.valueOf("50"));
          vector1.add("50");
          //ASCENDING ORDER
         // Iterator<Object> it = vector1.iterator();
          ListIterator<Object> it1 = vector1.listIterator();
          while(it1.hasNext()){
        	  System.out.println(it1.next());
          }
          //DESCENDING ORDER
                  
                  while(it1.hasPrevious()){
                	  System.out.println(it1.previous());
                  }
	}

}
