package com.chap1;
import java.util.*;
public class Exam5 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("������", 85);
		map.put("������", 80);
		map.put("���쾾", 95);
		System.out.println("�� Entry �� : "+ map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : "+ value);
		}
		
	}
}
