public class Hello2 {

    public static void main(String[] args) {
      String makeOfCar = "Volkswagen";
      boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

      if (isDomestic) {
          System.out.println("This car is domestic to our country");
      }
      String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
      System.out.println(s);

      double myFirstValue = 20.00d;
      double mySecondValue = 80.00d;
      double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
      System.out.println(myFirstValue + mySecondValue);

      boolean gameOver = true;
      int score = 800;
      int finalScore = score;
      int levelCompleted = 5;
      int bonus = 100;
      if (gameOver) {
          finalScore += (levelCompleted * bonus);
          finalScore += 1000;
          System.out.println("Your final score was " + finalScore);
      }
    }
}
