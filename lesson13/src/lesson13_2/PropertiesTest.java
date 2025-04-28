package lesson13_2;

import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties props = System.getProperties();
		Set<Object> keys = props.keySet();
		for(Object o : keys) {
			System.out.println(o + " :: " + System.getProperty(o.toString()));
		}
		Object o = 10;
		Object o2 = "abcd";
		Object o3 = props;
		
	}
}
