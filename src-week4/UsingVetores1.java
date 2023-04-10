import java.util.Scanner;

public class UsingVetores1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = { 1, 0, 5, -2, -5, 7 };
		
		int sum = (A[0] + A[1] + A[5]);

		System.out.println("A soma dos vetores e : " + sum);

		for (int i = 0; i < A.length; i++) {

			System.out.print("Modifique o vetor na posicaoo 4, atribuindo a esta posicao o valor 100: ");
			A[i] = sc.nextInt();
			

			System.out.println("Os valores do vetor A:" + A[i]);
		}
		sc.close();
	}
}
