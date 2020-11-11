import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("a.txt");
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		List<String> filteredList = stream.filter(s -> s.length() <= 2).collect(Collectors.toList());

		for (String s : filteredList) {
			System.out.println(s);
		}

	}
}
