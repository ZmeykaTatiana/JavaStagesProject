package by.itstep.zmeyka.lesson27.model.logic;



public class Number {
    //0!
    public static int zero(){
        return 1;
    }
    //1!
    public static int first(){
        return 1;
    }

    //2!
    public static int second(){
        return 2*first();
    }
    //n!
    public static int factorial(int n){
        if(n<0){
            return -1;
        }

        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
