package Project01;

import java.util.Scanner;

/*4. 평균을 구하시오.
 * 1번에서 작성한 소스코드를 적극 활용하세요.
 * 입력정보 : 학생 이름과 성적(100점 만점), 중복값은 없는것으로 가정한다. 
 * 출력 : 입력된 점수 중 최대값을 제외하세요. 
 * 그 다음 나머지 2명의 점수의 평균을 구하여 출력하시오.
 * 학습정보 : 형변환 반드시 사용할 것!
 */
public class Pro04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stu  s = new Stu();
		int max=0, total=0;
		double a ;
		s.set();
		
		for(int i = 0; i<s.name.length; i++) {
			total = s.sco[i]+total;
			if(max<s.sco[i]) {
				max=s.sco[i];
			}
		}
		total = total - max;
		a =  total/(s.name.length-1);
		System.out.println("최대값 제외 평균은 : " + a);
		sc.close();
	}
}
