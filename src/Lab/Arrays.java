package Lab;

public class Arrays {
    public static void main(String[] args) {

//        int[] num = new int[100];
//        int sum = 0;
//        for (int i =0 ; i < num.length; i++){
//            num[i] = 2 * i + 2;
//            System.out.println(num[i]);
//        }
//        for (int i =0 ; i < num.length; i++){
//            System.out.println(num[i]);
//        }

//        String[] names = {"tom", "lisa", "gracy", "mac"};
//        for(int i =0; i< names.length; i++){
//            System.out.println(names[i]);
//        }
//        for(String nm:names){
//            System.out.println("Name is "+nm);
//        }
//
//        double[] points = {1.2, 3.2, 3.5, 4.2, 4.0, 5.6, 3.2, 3.2, 9.0};
//
//        double[] points2 = new double[points.length];
//        double target = 8.0;
//        int count = 0;
//
//        for(int i = 0; i < points.length; i++){
//            if(points[i] == target){
//                count++;
//            }
//       }
//        System.out.println("Count of target is "+count);
//
//        for(int i = points.length-1; i >= 0 ; i--){
//            System.out.println(points[i]);
//        }

//        int[] list1 = {1,2,3,4,5,6};
//        int[] list2 = new int[list1.length];
//        // list2 = [6,5,4,3,2,1]
//        int i;
//
//        for (int j = list1.length-1 ; j >= 0 ; j--){
////            System.out.println(list1[j]);
//            int index = (list1.length - 1) - j;
//            list2[index] = list1[j];
//        }
//        System.out.println(java.util.Arrays.toString(list2));
 //     [ [1 ,2, 3], [4 ,5, 6], [7, 8, 9]  ]
//
//        int[][] matrix = new int[3][3];
//        int rows = matrix.length;          //  Number of rows
//        int columns = matrix[0].length;    //  Number of columns
//
//        int count = 1;
//        for(int i = 0; i < rows; i++){
//            for(int j = 0 ; j < columns; j++){
//                matrix[i][j] = count;
//                count++;
//            }
//        }

//        String[][] names = {{"Maths", "CS", "Science"},
//                            {"Geog", "Hist", "Bio"},
//                            {"Literature", "Stats", "Physics"}};
//
//        int students = names.length;
//        int classes = names[0].length;
//
//        for (int i = 0; i < students; i++){
//            for (int j = 0; j < classes; j++){
//                System.out.println(names[i][j]);
//            }
//        }
//
//        System.out.println("Student 1 has taken these courses "+ java.util.Arrays.toString(names[0]));
//        System.out.println("Student 2 has taken these courses "+ java.util.Arrays.toString(names[1]));
//        System.out.println("Student 3 has taken these courses "+ java.util.Arrays.toString(names[2]));
//
//        A = [ [1 ,2, 3], [4 ,5, 6], [7, 8, 9]  ]
//        B = [ [1 ,2, 5], [4 ,5, 6], [7, 8, 9]  ]

        int[][] A = {{1,2,3}, {4,5,6}};
        int[][] B = {{1,2,3}, {4,5,7}};

        int A_rows = A.length;
        int A_columns = A[0].length;

        int B_rows = B.length;
        int B_columns = B[0].length;

        if(A_rows != B_rows || A_columns != B_columns){
            System.out.println("1. Two arrays are different");
        }
        else {
            for (int i = 0; i < A_rows; i++) {
                for (int j = 0; j < A_columns; j++) {
                    if (A[i][j] != B[i][j]) {
                        System.out.println("2. Two arrays are different");
                        break;
                    }
                }
            }
        }











//        for (int n:num) {
//            System.out.println("Number is "+n);
//        }
////        for

//        int sum = 0;
//        for (int i = 0; i < num.length; i++){
//            sum = sum + num[i];
//        }

//        System.out.println("Sum is "+sum);
//        System.out.println("Average is "+sum/num.length);
    }
}
