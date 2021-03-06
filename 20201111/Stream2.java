import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

	public static void main(String[] args) {
		String[] array = {"포도", "바나나", "사과", "아보카도", "오렌지"};
		Stream<String> stream = Arrays.stream(array);
		List<String> filteredList = stream.filter(s -> s.length() <= 2).collect(Collectors.toList());

		for (String s : filteredList) {
			System.out.println(s);
		}

	}

}
