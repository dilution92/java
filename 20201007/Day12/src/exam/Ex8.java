package exam;
import java.util.Scanner;
public class Ex8 {

   public static void main(String[] args) {
      int a=0;
      String [] study = new String[100];
      System.out.print("������ �Է��ϼ���.");
      Scanner sc = new Scanner(System.in);
      String stu = sc.next();
      System.out.println("");

      for(;;) {
         System.out.print("* ���Ͻô� ��ȣ�� �Է��ϼ��� : 1. �л� �̸� �߰� 2. �л� ��� ǥ�� 3. ���α׷� ����");
         int num = sc.nextInt();
         if(num == 1) {
               System.out.print("* �л� �̸� >> ");
               study[a] = sc.next();
               a++;
         }else if(num == 2) {
            System.out.println("* �л� ��� ǥ��");
            for (int i = 0; i <a; i++) {
               System.out.println((i+1)+". " +study[i]);
            }
         }else {
            System.out.println("���α׷��� ����Ǿ����ϴ�.");
            break;
         }
      }

   }
}