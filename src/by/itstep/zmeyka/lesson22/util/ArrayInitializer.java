package by.itstep.zmeyka.lesson22.util;
import java.util.Scanner;

import java.util.Random;

public class ArrayInitializer {

    private static final Scanner SCANNER=new Scanner(System.in);
    private static final Random RANDOM=new Random();



    public static void randomInit(int[]array,int min, int max){
        Random random = new Random();
        for (int i=0; i< array.length;i++){
            array[i]=RANDOM.nextInt(max-min+1)+min;
        }

    }
    public static void userInit (int[] array){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
    }
    public static int inputIntValue(String promt){
        System.out.print(promt);
        return SCANNER.nextInt();
    }
}
