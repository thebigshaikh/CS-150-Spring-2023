
// QRCode.java
import java.util.Random;

public class QRCode {

    static int[][] grid;

    // This funcionn creates a grid based on the dimension and seeds passed

    public int[] createPattern(int dim, int seed) {
        int[] pattern = new int[dim * dim];
        Random rand = new Random(seed);
        for (int i = 0; i < dim * dim; i++) {
            pattern[i] = rand.nextInt(2);
        }
        return pattern;
    }

    public void setGrid(int dim, int[] pattern) {
        grid = new int[dim][dim];
        int val = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                grid[i][j] = pattern[val++];
            }
        }
    }

    public int[][] getGrid() {
        //return grid;
        int[][] tmp = new int[grid.length][grid.length];
        int val = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                tmp[i][j] = grid[i][j];
            }
        }
        return tmp;
    }

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%1d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void print(int[] pattern) {
        int pos = 0;
        int dim = (int)Math.sqrt(pattern.length);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.printf("%1d", pattern[pos++]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void print() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%1d", grid[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void addFinders(int dimension) {
        setFinder(0,0); // upper left
        setFinder(0, dimension-15); // lower left
        setFinder(dimension-15, 0); // upper right
    }

    public void setFinder(int startX, int startY) {
        fillSquare(startX, startY, 15, 2, 1); // white = 1
        fillSquare(startX+2, startY+2, 11, 2, 0); // black 0
        fillSquare(startX+4, startY+4, 7, 2, 2);
        fillSquare(startX+6, startY+6, 3, 2, 3);
    }

    public void fillSquare(int startX, int startY, int length, int borderWidth, int color) {
        //error check total size
        for (int row = startY; row < startY+length; row++) {
            for (int col = startX; col < startX+length; col++) {
                grid[row][col] = color;
            }
        }
    }

    public static void main(String args[]) {

        QRCode qrc = new QRCode();
        final int DEFAULT_SEED = 160;
        final int DEFAULT_DIMENSION = 30;
        int[] pattern = null;
        int seed = DEFAULT_SEED;
        int dim = DEFAULT_DIMENSION;

        if (args.length == 2) {
            dim = Integer.parseInt(args[0]);
            seed = Integer.parseInt(args[1]);
        }
        // Generate a random pattern which will get put into a 2-D grid
        pattern = qrc.createPattern(dim, seed);
        //qrc.print(pattern);

        qrc.setGrid(dim, pattern);
        qrc.addFinders(dim);

        grid = qrc.getGrid();
        qrc.print(grid);
    }

}
