package java_basic;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShapeMain {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");

		m.forEach((key, value) -> {
			System.out.println(String.format("키 -> %s, 값 -> %s", key, value));
		});
		out.println("============================================");
		// 2번
		Iterator<Integer> keys = m.keySet().iterator();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.println(String.format("키 -> %s, 값 -> %s", key, m.get(key)));
		}
		out.println("============================================");
		// 3번
		for (Map.Entry<Integer, String> elem : m.entrySet()) {
			System.out.println(String.format("키 -> %s, 값 -> %s", elem.getKey(), elem.getValue()));
		}
		out.println("============================================");
		// 4번
		for (int key : m.keySet()) {
			System.out.println(String.format("키 -> %s, 값 -> %s", key, m.get(key)));
		}
	}
}
