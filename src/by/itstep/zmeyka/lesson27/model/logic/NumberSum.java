package by.itstep.zmeyka.lesson27.model.logic;

public class NumberSum {
    public static int sumAllNumbers(int number) {
        if(number<0){
            return -1;
        }
        number=number>=0?number: -number;
        if (number<10){
            return number;
        }
        return number%10+sumAllNumbers(number/10);
    }

    public static int sumAllArrayDigit(int[] array){
        if (array.length==1){
            return array[0];
        }
        int size=array.length-1;
        int[] temp=new int[array.length-1];
        for (int i=0;i<size;i++) {
            temp[i] = array[i];
        }
            return array[size]+sumAllArrayDigit(temp);
        }




    }



}


