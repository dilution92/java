package exam;
import java.util.Scanner;
public class Ex8 {

   public static void main(String[] args) {
      int a=0;
      String [] study = new String[100];
      System.out.print("과목을 입력하세요.");
      Scanner sc = new Scanner(System.in);
      String stu = sc.next();
      System.out.println("");

      for(;;) {
         System.out.print("* 원하시는 번호를 입력하세요 : 1. 학생 이름 추가 2. 학생 목록 표시 3. 프로그램 종료");
         int num = sc.nextInt();
         if(num == 1) {
               System.out.print("* 학생 이름 >> ");
               study[a] = sc.next();
               a++;
         }else if(num == 2) {
            System.out.println("* 학생 목록 표시");
            for (int i = 0; i <a; i++) {
               System.out.println((i+1)+". " +study[i]);
            }
         }else {
            System.out.println("프로그램이 종료되었습니다.");
            break;
         }
      }

   }
}