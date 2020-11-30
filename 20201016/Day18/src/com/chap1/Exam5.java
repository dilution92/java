package com.chap1;
import java.util.*;
public class Exam5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("¾ÆÇöÀÌ", 85);
		map.put("À±Áö¾ç", 80);
		map.put("¼­¿ì¾¾", 95);
		System.out.println("ÃÑ Entry ¼ö : "+ map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : "+ value);
		}
		
	}
}
