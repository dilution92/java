import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream6 {

	public static void main(String[] args) {
		final String[] array = {"����", "�ٳ���", "���", "�ƺ�ī��", "������"};
		final Stream<String> stream = Arrays.stream(array);

		final Optional<String> maybeString 
		= stream.filter(s -> s.length() >= 4)
		.findFirst();
		final Optional<String> o = Optional.ofNullable(null);

		System.out.println(o.isPresent());
		System.out.println(o.isEmpty());

		final String s = maybeString.get();
		System.out.println(s);
	}
}

