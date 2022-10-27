package day4;
import java.util.Random;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {


        int index =0;
        int x =0;
Random randomNumber = new Random();
int [] matrice = new int [100];
for (int i =0; i<matrice.length; i++){
    matrice[i] = randomNumber.nextInt(10000);

     }
for (int i =0; i<matrice.length - 2; i++){
    int summa =0;
        for (int j=0; j< i+3; j++){
               summa += matrice[j];

        }
        if (summa>x){
            x=summa;
            index =i;
        }
    //System.out.println(summa);
    }

        System.out.println(x);
        System.out.println(index);
        System.out.println(Arrays.toString(matrice));
    }

}


