package hashmap;
import java.util.*;
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("hana", "1111");
		map.put("nana", "1234");
		Scanner sc = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.
		
		while(true) {
			System.out.println("id 와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim(); // trim은 스페이스바 제거
			
			System.out.println("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if(!(map.get(id).equals(password))) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}
		}
	}
	
	
	
	
}
