package allLessons.datatypes.collections;

import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class MethodForEach {

	public static void main(String[] args) {
		
		
		Consumer fun=(abc)->{
			if(abc.equals("t-shirt")) {
				System.out.println(abc+"----00-0hhghhg");
			}
		
		};
		// TODO Auto-generated method stub
		String name = "t-shirt";
		int prise = 123;
		String size = "md";

		String name1 = "t-shirt";
		int prise1 = 123;
		String size1 = "lg";

		LinkedList allitems = new LinkedList();
		allitems.add(name);
		allitems.add(name1);
		allitems.add(prise1);
		allitems.add(prise);
		allitems.add(size1);
		allitems.add(size);
		System.out.println(allitems);
		allitems.forEach(fun);
	}

}
