package task1.Q2;

public class maiin {
    public static void main(String[] args) throws InterruptedException {
        int row;
        int[][] a = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int[][] b = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int[][] c = new int[3][3];

        for (row = 0; row < 3; row++) {
            matrix m1 = new matrix(a, b, c, row);
            Thread t1 = new Thread(m1);
            t1.start();

        }
        for ( row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(c[row][col] + " ");
          
            }
 System.out.println();
        }
    }
}
