package day2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int value = a+1;
        while (  b > value) {
                if (value % 5 == 0 && value % 10 != 0) {
                    System.out.println(value +" ");
                     } else if ( a >= b) {
                    System.out.println("Некоректный ввод");
                }
                value++;
            }
        }
    }

