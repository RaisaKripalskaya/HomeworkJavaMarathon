package day3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner number = new Scanner (System.in);

  for (double i = 0; i< 5; i++){
      Double number1 = number.nextDouble();
      Double number2 = number.nextDouble();
      if (number2 == 0){
          System.out.println("Деление на 0");
          continue;
      }
      System.out.println(number1/number2);
      }


  }
    }

