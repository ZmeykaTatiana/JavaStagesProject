package by.itstep.zmeyka.javastages.stage12.task1.controler;
import by.itstep.zmeyka.javastages.stage12.task1.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Printer.print("Input four numbers");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();

        boolean result=true;
        String msg=result? "Yes":"No";
        Printer.print(msg);






    }
}
