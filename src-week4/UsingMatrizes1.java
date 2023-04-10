import java.util.Scanner;

public class UsingMatrizes1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
		int count = 0;

		for (int lin = 0; lin < mat.length; lin++) {
			for (int col = 0; col < mat.length; col++) {

				System.out.print("Digite o valor da posicao: [" + lin + "] [" + col + "]: ");
				mat[lin][col] = sc.nextInt();

				if (mat[lin][col] > 10) {
					count++;
				}
			}
		}

		System.out.print("A matriz possui " + count + " valores maiores que 10.");
		sc.close();
	}

}
