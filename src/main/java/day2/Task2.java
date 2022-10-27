package day2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
Scanner number = new Scanner (System.in);
        System.out.println(" Вывод: ");
int a = number.nextInt();
int b = number.nextInt();
  for (int i = a + 1; b > i; i++){
     if (i % 5 == 0 && i% 10 !=0) {
          System.out.println(i + " " );
     } else if (a >=b) {
         System.out.println("Некоректный ввод");
     }
  }
    }
}
