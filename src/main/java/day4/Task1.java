package day4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      Random rand = new Random();
      int sizeMatrice = number.nextInt();
      int [] matrice = new int[sizeMatrice];
      int cetcik8 =0;
      int cetcik1 =0;
      int chetnoeNumber=0;
      int notChetnoeNumber = 0;
      int summaMatrice =0;
      for (int i =0; i < matrice.length; i++) {
          matrice[i] = rand.nextInt(10);

          if (matrice[i] > 8) {
              cetcik8++;
          }
          if (matrice[i] == 1){
              cetcik1++;
          }
          if (matrice[i] % 2 ==0){
              chetnoeNumber++;
          }
          if (matrice[i] % 2 !=0) {
              notChetnoeNumber++;
          }
     summaMatrice = summaMatrice + matrice[i];
      }
        System.out.println(Arrays.toString(matrice));
        System.out.println("Длина массива: "+matrice.length);
        System.out.println("Количество чисел больше 8: " + cetcik8);
        System.out.println("Количество чисел равных 1: " + cetcik1);
        System.out.println("Количество четных чисел: " + chetnoeNumber);
        System.out.println("Количество нечетных чисел: " + notChetnoeNumber);
        System.out.println("Сумма всех элементов массива: " + summaMatrice);



       // System.out.println("Сумма всех элементов массива: ");
    }
    }

