package hashmap;
import java.util.*;
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("hana", "1111");
		map.put("nana", "1234");
		Scanner sc = new Scanner(System.in); // ȭ�����κ��� ���δ����� �Է¹޴´�.
		
		while(true) {
			System.out.println("id �� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = sc.nextLine().trim(); // trim�� �����̽��� ����
			
			System.out.println("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}else {
				if(!(map.get(id).equals(password))) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}
	
	
	
	
}
