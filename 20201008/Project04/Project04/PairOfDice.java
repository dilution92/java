package Project04;

// PairOfDice.java: 주사위 쌍을 모델한다

public class PairOfDice
{
   private int faceValue1; // 첫 번째 주사위 숫자
   private int faceValue2; // 두 번째 주사위 숫자

   // 두 개의 주사위 객체들을 생성한다. 최초 주사위 숫자들은 1이다.
   public PairOfDice ( )
   {
      faceValue1 = 1;
      faceValue2 = 1;
   }

   // 주사위 두 개를 던진다
   public void roll( )
   {
      faceValue1 = (int) (Math.random() * 6) + 1;
      faceValue2 = (int) (Math.random() * 6) + 1;
   }

   // 첫 번째 주사위 숫자를 반환한다
   public int getFaceValue1( )
   {
      return faceValue1;
   }

   // 두 번째 주사위 숫자를 반환한다
   public int getFaceValue2( )
   {
      return faceValue2;
   }
}