import java.util.Scanner;
import java.util.SortedMap;

public class Calculator {
    int add(int num1, int num2){
        return num1+num2;
    }

    int subtraction(int num1, int num2){
        return num1-num2;
    }

    int multiplication(int num1, int num2){
        return num1*num2;
    }

    double division(int num1, int num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1  = sc.nextInt();

        System.out.println("Enter number 2");
        int number2  = sc.nextInt();

        System.out.println("Enter operation- add, sub, mul, div");
        String operation = sc.next();

        if(operation.equals("add")){
            int result = calculator1.add(number1, number2);
            System.out.println(result);
        }
        else if(operation.equals("sub")){
            int result = calculator1.subtraction(number1, number2);
            System.out.println(result);
        }
    }
}
