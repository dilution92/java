import java.util.ArrayList;
import java.util.List;

public class Quicksort {
	
	static List<Integer> sort(List<Integer> origin) {
		
		// 0. 탈출조건
		if(origin.isEmpty()) {
			return origin;
		}
		
		// 1. 피벗 선정
		final Integer pivot = origin.get(0);
		
		// 2. 피벗 중심으로 분류
		List<Integer> greater = new ArrayList<>();
		List<Integer> less =  new ArrayList<>();
		List<Integer> pivots =  new ArrayList<>();
		for(Integer n : origin) {
			if(n < pivot) {
				less.add(n);
			} else if(n > pivot) {
				greater.add(n);
			}else {
				pivots.add(n);
			}
		}
		
		// 3. 분류된 새로운 리스트들을 정렬
		less = sort(less);
		greater = sort(greater);
		
		less.addAll(pivots);
		less.addAll(greater);
		
		return less;
		
		
		
		
		
		
//		List<Integer> greater = List.of();
//		List<Integer> less = List.of();
//		List<Integer> same = List.of();
//		
//		// 1. 피벗 선정
//		final Integer pivot = origin.get(0);
//		
//		// 2. 피벗 중심으로 분류
//		for(int i=0; i < origin.size(); i ++) {
//			if(origin.get(i) > pivot) {
//				greater.add(origin.get(i));
//			}
//		}
//		
//		for(int i=0; i < origin.size(); i ++) {
//			if(origin.get(i) < pivot) {
//				less.add(origin.get(i));
//			}
//		}
//		
//		for(int i=0; i < origin.size(); i ++) {
//			if(origin.get(i) == pivot) {
//				same.add(origin.get(i));
//			}
//		}
//		
//		if(greater.size() > 2) {
//			sort(greater);
//		}
//		
//		if(less.size() > 2) {
//		sort(less);
//		}
//		
//		// 3. 분류된 새로운 리스트들을 정렬
//		
//		// 4. 취합
//		List<Integer> joined = List.of();
//		joined.addAll(less);
//		joined.addAll(same);
//		joined.addAll(greater);
//
//		

	}
}
