package Lab;

public class S6 {
    public static void main(String[] args) {
        final int ROWS = 8;
        final int SEATS = 15;
        float[][] seatMap = new float[ROWS][SEATS];

        // 0 = Available, 1 = reserved, 2 = sold out

        seatMap[0][0] = 2;
        seatMap[0][1] = 0;
        seatMap[0][2] = 1;
        seatMap[0][7] = 1;
        seatMap[0][6] = 1;
        seatMap[0][9] = 1;

        seatMap[6][5] = 2;

        seatMap[1][3] = 2;
        seatMap[1][4] = 0;
        seatMap[1][5] = 1;
        seatMap[1][6] = 2;




        System.out.println("Seat map contents are:");
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < SEATS; j++)
            {
                if(seatMap[i][j] == 0){
                    System.out.println("Row "+i+" , Seat "+j+" is available");
                }
            }
            System.out.println();
        }


    }
}
