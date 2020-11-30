package Project04;

// Driver.java: 주사위 게임을 실행한다

import java.util.*;

public class Driver
{
 public static void main (String[] args)
 {
   String flag = "예";
   PairOfDice dice;
   Player player1, player2;

   Scanner scan = new Scanner(System.in);

   dice = new PairOfDice();
   player1 = new Player ("길동");
   player2 = new Player ("감찬");

   do
   {
      // 첫 번째 선수가 주사위쌍을 던진다
      System.out.println(player1.getName());
      player1.roll(dice);

      // 두 번째 선수가 주사위쌍을 던진다
      System.out.println(player2.getName());
      player2.roll(dice);

      // 승자를 확인한다.
      if (player1.getTotal() > player2.getTotal())
      {
         System.out.println(player1.getName() + "이 이겼습니다!");
      }
      else if (player1.getTotal() < player2.getTotal())
      {
         System.out.println(player2.getName() + "이 이겼습니다!");
      }
      else System.out.println("비겼습니다!");

      // 게임 계속 여부를 물어 본다
      System.out.print("\n게임을 계속하시겠습니까?(예 혹은 아니오): ");
      flag = scan.next();
      } while (flag.equals("예"));
   }
}