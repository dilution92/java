import java.util.*;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		List<String> list = List.of("����", "�ٳ���", "���", "�ƺ�ī��", "������");

		List<String> filteredList =
				list.stream()   // 1. ��Ʈ�� ����
				.filter(s -> s.length() <= 2)   // 2. ���� �ܰ�
				.collect(Collectors.toList());  // 3. ���� �ܰ�

		for (String s : filteredList) {
			System.out.println(s);
		}

	}
}

