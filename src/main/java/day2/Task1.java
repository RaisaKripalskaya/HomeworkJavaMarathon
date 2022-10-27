package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
Scanner chiclo = new Scanner (System.in);
int home = chiclo.nextInt();
    if (home<=4){
        System.out.println("Малоэтажный дом");
    }else if (home ==5 || home<=8){
        System.out.println("Среднеэтажный дом");
    }else if (home >=9){
        System.out.println("Многоэтажный дом");
    } else {
        System.out.println("Ошибка ввода");
    }
    }
}
