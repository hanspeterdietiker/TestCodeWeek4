import java.util.Scanner;

public class UsingMatrizes2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[5][5];

		// lin=i; col=j;
		// Preencha com 1 a diagonal principal e com 0 os demaiselementos.

		for (int lin = 0; lin < mat.length; lin++) {
			for (int col = 0; col < mat[lin].length; col++) {
				if (lin == col) {
					mat[lin][col] = 1;
				} else {
					mat[lin][col] = 0;
				}
			}
		}
		for (int lin = 0; lin < mat.length; lin++) {
			for (int col = 0; col < mat[lin].length; col++) {
				System.out.print(mat[lin][col] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
