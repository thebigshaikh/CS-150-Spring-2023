import java.util.Scanner;

public class
Methods {

    public static void printPattern(int rows){

        for (int i=1; i<= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern_2(int rows){
        int alphabet = 97;
        for(int i= rows; i>=1; i--){

            for(int j = 1; j>=i; j--){
                System.out.print((char) alphabet);
            }
            alphabet += 1;
            System.out.println();
        }
    }

    public static int factorial(int num){
        int result = 1;
        for (int i = num; i >=1; i--) {
            result = result * i;
        }
        return result;

    }




    public static void main (String[] args)
    {

//        printPattern(4);
//        System.out.println((int) 'z');
//        printPattern_2(4);

        System.out.println(factorial(6));


    }
}

//   [97-122]
