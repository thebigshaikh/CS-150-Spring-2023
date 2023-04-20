import java.util.Arrays;

public class Methods_Example {
    
    int[] extract(int[][] array, int row){
        int[] result = new int[array[row].length];

        for(int i = 0; i< array.length; i++){
            if (i == row) {
                for(int j = 0; j<array[row].length;j++){
//                    System.out.println(array[i][j]);
                    result[j] = array[i][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        Methods_Example my_obj = new Methods_Example();
        int[][] input = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[] res = my_obj.extract(input, 1);
        System.out.println(Arrays.toString(res));
        
        
        
//        Methods_Example my_obj = new Methods_Example();
//        String numbers = "0-1-2-3-4-5-6-7-8-9";
//        String alphabets = "a,b,c,d,e,f,g";
//        String alpha_num = "0_a_2_b_4_c";

//        String[] numbers_array = numbers.split("-");
//        String[] alphabets_array = alphabets.split(",");
//        String[] alpha_num_array = alpha_num.split("_");



//        System.out.println(Arrays.toString(my_obj.split_strings(numbers, "-")));
//        System.out.println(Arrays.toString(my_obj.split_strings(alphabets, ",")));
//        System.out.println(Arrays.toString(my_obj.split_strings(alpha_num, "_")));
//

    }
}
