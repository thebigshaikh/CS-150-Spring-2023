package Methods;

class Adder{
    static int add(int a,int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    // 1. The number of parameters should be different
    //or
    //2. Data type of parameters should be different

    public static void main(String[] args){
        int a = 10;
        int b = 20;

        double c = 30.39;
        double d = 110.50;

        int result1 = add(a, b);
        System.out.println(result1);
        System.out.println(add(a, b));


        double result2 = add(c, d);




    }
}
