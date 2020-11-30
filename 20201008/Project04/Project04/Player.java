package Project04;

// Player.java: 주사위 게임 선수를 모델한다

// 각 선수는 이름과 점수를 가진다.
class Player
{
   private String name; // 선수 이름
   private int total; // 선수가 얻은 점수

   // 이름을 주어진 값으로 초기화하고 점수를 0으로 초기화한다
   public Player(String newName)
   {
      setName(newName);
      total = 0;
   }

   // 이름을 주어진 값으로 변경한다
   public void setName(String newName)
   {
      name = newName;
   }

   // 주사위 쌍을 던지고 결과를 다룬다.
   public void roll (PairOfDice dice)
   {
      int value1, value2;

      dice.roll();
      value1 = dice.getFaceValue1();
      value2 = dice.getFaceValue2();
      total = value1 + value2;
      System.out.println("￦t주사위 1: " + value1 + " 주사위 2: "
                        + value2 + " 점수: " + total);
   }
   // 선수의 이름을 반환한다
   public String getName()
   {
      return name;
   }

   // 선수가 얻은 점수를 반환한다.
   public int getTotal()
   {
      return total;
   }
}