package exam;
import java.util.Scanner;

public class Ex02_help {

}

class Student11 {
   String name;

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int classNumber = 0;
      
      String[] subject = new String[3];
      subject[0] = "java";
      subject[1] = "python";
      subject[2] = "c++";

      Student11[] stu = new Student11[10];
      int menu = 1;
      int i = 0;

      while(true) {


         System.out.println("1. �л� �̸� �߰�");
         System.out.println("2. �л� ��� ǥ��");
         System.out.println("3. ���α׷� ����");

         menu = scan.nextInt();

         if(menu == 1) {

            System.out.println("������ �Է��ϼ���. ");
            String subject1 = scan.next();
            for(i=0; i<3; i++) {
            if(subject1.equals(subject[i])) {
                  System.out.println("�л� �̸��� �߰����ּ���.");
                  stu[classNumber] = new Student11();
                  stu[classNumber].name = scan.next();
                  classNumber++;
               }
            }
         }

         if(menu == 2) {
            System.out.println("������ �Է��ϼ���. ");
            String subject1 = scan.next();
            for(i=0; i<3; i++) {
               if(subject1.equals(subject))
                  System.out.println(stu[i].name);   
            }
         }

         if(menu == 3) {
            System.out.println("���α׷� ����");
         }
      }



   }
}