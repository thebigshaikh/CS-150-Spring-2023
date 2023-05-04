import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {



//        int[] number2 = {10, 20, 30};
//
//        int array_size = number2.length;
//        System.out.println(array_size);

        int[] marks = { 90, 80 , 70, 60, 50};

        int size = marks.length;
        int sum = 0;

        for(int i = 0; i < size; i++){
            sum = sum + marks[i];
        }

        double average_marks = (double) sum/size;

        System.out.println(average_marks);





//    [1,2,3,4,5,6,7]
//    [7,1,2,3,4,5,6] === 1st rotation
//    [6,7,1,2,3,4,5] === 2nd rotation
//    [6, 7, 1,2,3,4,5]




    }
}
