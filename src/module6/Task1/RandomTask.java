package module6.Task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by Дима on 05.12.2016.
 */
public class RandomTask {

    public static void main(String[] args) {

      int a = 1;
        int b = 10;

        int[] array = new int[20];

        for (int i=0; i < array.length; i++) {

            array[i] = gerRandomInt(a, b);
        }

        System.out.println(Arrays.toString(array));

    }



    public static int gerRandomInt(int a, int b){

        Random random = new Random();
       return a + random.nextInt(b-a+1);

    }



}
