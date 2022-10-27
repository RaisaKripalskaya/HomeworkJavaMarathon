package day4;
import java.util.Random;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {
        Random x = new Random();
        int[] numbers = new int[100];
        int max = 0;
        int min = 1000;
        int j =0;
        int y=0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = x.nextInt(10000);
        }
            System.out.println();
            System.out.println(Arrays.toString(numbers));
            for (int s : numbers) {
                if (max < s) {
                    max = s;
                }
                if (min > s) {
                    min = s;
                }
                if (s % 10 == 0) {
                    j++;
                }
                if (s % 10 == 0) {
                    y +=s;
                }

            }

        System.out.println(j);
        System.out.println(y);
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минииальное значение массива:  " + min);
        }

    }



