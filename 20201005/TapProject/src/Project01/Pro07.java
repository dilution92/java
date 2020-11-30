package Project01;

import java.util.Scanner;

/*7. 학점 계산 프로그램을 작성하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는 걸로 가정한다.
 * 출력 : 입력된 성적(점수)가 90점 이상이면 A학점, 
 * 89~80점이면 B학점, 79점 이하면 F학점으로 출력
 * 학습정보 : 단, 단독 if~else if문 사용하세요.
 */
public class Pro07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		s.set();
		String [] rank = new String[3];
		for(int i = 0; i<s.name.length; i++) {
			if(s.sco[i]>=90) {
				rank[i]="A";
			}else if(s.sco[i]>=80) {
				rank[i]="B";
			}else {
				rank[i]="F";
			}
		}		
		for(int i = 0; i<s.name.length; i++) {
			System.out.println(s.name[i]+"의 학점은 "+rank[i]);
		}
		sc.close();
	}

}
