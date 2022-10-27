package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
    Scanner f = new Scanner (System.in);
        double number1 = f.nextDouble();
        double number2 = f.nextDouble();
     while (true){
         if (number2 == 0){
             System.out.println("Работа программы завершается");
            break;
         } else if (number1 !=0){
             System.out.println("Ответ:");
             System.out.println(number1 / number2);
             break;
         }

     }
    }
}

