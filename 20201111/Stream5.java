import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {
	public static void main(String[] args) throws IOException {
		final String[][] test = {
                {"abc", "def"}, {"�ƹ���"}, {"������", "�����", "ȣ����"}
        };

        final List<String> list = Arrays.stream(test)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        for (String s : list) {
            System.out.println(s);
        }

	}
}
