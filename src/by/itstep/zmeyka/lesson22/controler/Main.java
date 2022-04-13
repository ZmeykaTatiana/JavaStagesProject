package by.itstep.zmeyka.lesson22.controler;

import by.itstep.zmeyka.lesson22.model.logic.ArrayLogic;
import by.itstep.zmeyka.lesson22.util.ArrayInitializer;
import by.itstep.zmeyka.lesson22.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size= ArrayInitializer.inputIntValue("Input size of array: ");
        int[] array= new int[size];

        int min= ArrayInitializer.inputIntValue("Input min of array: ");
        int max= ArrayInitializer.inputIntValue("Input max of array: ");
        ArrayInitializer.randomInit(array,min,max);


        int count= ArrayLogic.countNonZeroElements(array);

        String msg=String.format("\nCount of none zero elements is %d", count);
        Printer.print("Array:" + Arrays.toString(array));
        Printer.print(msg);



    }
}
