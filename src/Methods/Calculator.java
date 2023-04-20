package Methods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Calculator {

    public static void print(){
        System.out.println("Hi! Welcome to my calculator. \n. You can use this to add, sub, mul and divide");

    }

    public static int sumArray(int[] arr){
        int res = 0;
        for(int i = 0; i<arr.length; i++){
            res += arr[i];
        }
        return res;
    }

    // arr = {1,2,3,4} === { 4,3,2,1}
    public static int[] reverseArray(int[] arr){
        int[] rev = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--){

            rev[arr.length - i - 1] = arr[i];

        }
        return rev;
    }

    public static String[] reverseArrayString(String[] arr){
        String[] rev = new String[arr.length];

        for(int i = arr.length-1; i >= 0; i--){

            rev[arr.length - i - 1] = arr[i];

        }
        return rev;
    }

    public static int add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static int subtract(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2){
        int result = num1 * num2;
        return result;
    }

    public double divide(int num1, int num2){
        double result = num1 / num2;
        return result;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//        print();
//
//        System.out.println("What operation you want to perform? \n ADD SUB MUL DIV");
//        String op = scan.nextLine();
//
//        System.out.println("Enter number 1");
//        int n1 = scan.nextInt();
//
//
//        System.out.println("Enter number 2");
//        int n2 = scan.nextInt();
//
//
//
//        if(op.equalsIgnoreCase("ADD")){
//            int ans = add(n1, n2);
//            System.out.println("Result is "+ans);
//        }
//        else if(op.equalsIgnoreCase("SUB")){
//            int ans = subtract(n1, n2);
//            System.out.println("Result is "+ans);
//        }
//        else if(op.equalsIgnoreCase("DIV")){
//            double ans = divide(n1, n2);
//            System.out.println("Result is "+ans);
//        }
//        else if(op.equalsIgnoreCase("MUL")){
//            int ans = multiply(n1, n2);
//            System.out.println("Result is "+ans);
//        }
//        else if(op.equalsIgnoreCase("SUMARR")){
//            int[] a = {1,2,3,10, 100, 1101101, 3210, 101};
//
//            int ans = sumArray(a);
//            System.out.println("Result is "+ans);

//        int[] numarray = { 10, 20, 30, 40, 50};
////        int result = sumArray(numarray);
////        System.out.println("Sum is "+result);
//
//        int[] reversed  = reverseArray(numarray);
//
//        System.out.println(Arrays.toString(reversed));

//        String[] names = {"Axel", "Bob", "Zak"};
//
//        String[] reversednames = reverseArrayString(names);
//
//        System.out.println(Arrays.toString(reversednames));

        int a = 10;
        int b = 20;
        int c = add(a, b);

        Calculator c1  = new Calculator();

        double result = c1.divide(b, a);





    }







    }



