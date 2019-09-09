package january;

import java.lang.reflect.Field;
import java.util.ArrayList;

//Mark Mozgovoy 1/30/17

public class ArrayListCapacityTester {
	
	public static void main(String[] args) throws Exception{
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		for(int i = 0; i < 1000; i++){
			list.add(0);
			System.out.println("The size is " + list.size());
			System.out.println("The capacity is " + getCapacity(list));
		}
	}
	
	static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
	
}
