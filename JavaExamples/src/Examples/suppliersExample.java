package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class suppliersExample {
	
public static void main(String[] args) {

		
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(8);
       System.out.print(a);
       Supplier<List<Integer>> supplier = () -> 
           new ArrayList<Integer>(a);
           System.out.println(supplier.get());
       }

}
