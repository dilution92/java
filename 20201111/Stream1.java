import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		List<String> list = List.of("포도", "바나나", "사과", "아보카도", "오렌지");

		List<String> filteredList =
				list.stream()   // 1. 스트림 생성
				.filter(s -> s.length() <= 2)   // 2. 가공 단계
				.collect(Collectors.toList());  // 3. 취합 단계

		for (String s : filteredList) {
			System.out.println(s);
		}

	}
}

