package day4;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] massiv = new int[12][8];

        int index = 0;
         int max = 0;
        for (int i = 0; i < massiv.length; i++) {
            int summa =0;

            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = rand.nextInt(50);
                summa += massiv[i][j];

            }
            if(max<=summa){
               max =summa;
               index = i;

            }
            System.out.println(summa);
        }

        System.out.println("Итог строки в которой сумма чисел максимальна " + max + " Индекс этой строки: " + index);
    }
}