package task1.Q2;

public class matrix implements Runnable {
	int row;
	int[][] a;//array 2
	int[][] b;//array 1
	int[][] c;//result

	public matrix(int[][] a, int[][] b, int[][] c, int row) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.row = row;

	}

	@Override
	public void run() {

		for (int col = 0; col < 3; col++) {

			c[row][col] = a[row][col] * b[row][col];

			//System.out.print(c[row][col]+" ");  //printing matrix   
		}

	}
}

	
