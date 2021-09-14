import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.println("Digite o valor de n e m respectivamente: ");
		n = sc.nextInt();
		m = sc.nextInt();
		int[][] mat = new int[n][m];
		int[][] mat2 = new int[n][m];
		System.out.println("Matriz 1");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = generator.nextInt(10);
				System.out.print("[" + i + "]" + "[" + j + "]:" + mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matriz 2");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat2[i][j] = generator.nextInt(10);
				System.out.print("[" + i + "]" + "[" + j + "]:" + mat2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matriz 3");
		int[][] mat3 = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] > mat2[i][j]) {
					mat3[i][j] = mat[i][j];
				} else {
					mat3[i][j] = mat2[i][j];
				}
				System.out.print("[" + i + "]" + "[" + j + "]:" + mat3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matriz 4");
		int[][] mat4 = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i <= j) {
					mat4[i][j] = 0;
				} 
				else {

					if (mat[i][j] < mat2[i][j]) {
						mat4[i][j] = mat[i][j];
					} 
					else {
						mat4[i][j] = mat2[i][j];
					}

				}
				System.out.print("[" + i + "]" + "[" + j + "]:" + mat4[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
