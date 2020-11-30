package hashmap;
import java.util.*;
public class HashMapEx2 {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);

		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+ e.getKey()+", 점수 : "+e.getValue());
		}
	}
}
