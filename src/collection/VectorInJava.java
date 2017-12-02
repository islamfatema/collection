package collection;

import java.util.List;
import java.util.Vector;

public class VectorInJava {

	public static void main(String[] args) {
	
          List vector =new Vector<>();
          vector.add(10);
          vector.add(20);
          vector.add(30);
          vector.add(true);
          vector.add("50");
          vector.add("50");
          System.out.println(vector);
          System.out.println(vector.size());
          System.out.println(vector.isEmpty());
          
          List<Object> vector1=new Vector<Object>();
          vector1.add(Integer.valueOf(10));
          vector1.add(20);
          vector1.add(30);
          vector1.add(true);
          vector1.add(String.valueOf("50"));
          vector1.add("50");
          System.out.println(vector1);
          System.out.println(vector1.size());
          System.out.println(vector1.isEmpty());
          
          Vector<Double> vector3=new Vector<Double>();
          vector3.add(Double.valueOf(10));
          vector3.add(20.98);
          vector3.add(Double.valueOf(30));
          vector3.add(7.98);
          vector3.add(4.93);
          System.out.println(vector3);
          System.out.println(vector3.size());
         vector3.add(2, 55.55);
          System.out.println(vector3.isEmpty());
          System.out.println(vector3.size());
          System.out.println(vector3);
	}

}
