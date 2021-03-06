import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, m;
		double aux = 0;
		System.out.println("Digite a precis?o: ");
		int precisao = sc.nextInt();
		System.out.println("Digite o valor de n e m respectivamente: ");
		n = 10;
		m = 10;
		int N = n * m;
		double mat[][] = { {151,161,166,168,169,170,173,176,179,182},{152,162,166,168,169,170,173,176,179,182},{154,163,166,168,169,171,174,176,180,183},{155,163,167,168,169,171,174,177,180,184},{158,163,167,168,169,171,174,177,180,185},{159,164,167,168,170,171,175,177,180,186},{159,165,167,168,170,172,175,177,181,187},{160,165,167,168,170,172,175,178,181,188},{161,165,168,169,170,172,175,178,181,190},{161,166,168,169,170,173,176,178,182,190}};
		// ----------------------------------Matrizes----------------------------------------------------------------------------------------------------------
		System.out.println("Matriz 2");
		for (int linha = 0; linha < mat.length; linha++) {
			for (int coluna = 0; coluna < mat[linha].length; coluna++) {
				int col = coluna;
				for (int i = linha; i < mat.length; i++) {
					for (int j = col + 1; j < mat[i].length; j++) {
						if (mat[linha][coluna] > mat[i][j]) {
							aux =  mat[linha][coluna];
							mat[linha][coluna] = mat[i][j];
							mat[i][j] = aux;
						}
					}
					col = -1;
				}

				System.out.print("[" + linha + "]" + "[" + coluna + "]:" + mat[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		// -----------------------------------------------------------------------------------------------------------------------------------------------------

		// Amplitude Amostral (AA);

		double AA = (mat[n - 1][m - 1] - mat[0][0]);
		System.out.println("Amplitude amostral: " + AA);
		System.out.println();

		// Numero de Classes

		double numClasses = 1 + 3.3 * (Math.log(n * m) / Math.log(10));
		numClasses = Math.ceil(numClasses);
		System.out.println("Numero de classes: " + numClasses);

		// Amplitude de classe

		double amplitudeClasses = AA / numClasses;
		BigDecimal valorExato2 = new BigDecimal(amplitudeClasses);
	    valorExato2 =  valorExato2.setScale(precisao,RoundingMode.HALF_DOWN);
	    amplitudeClasses = valorExato2.doubleValue();
		System.out.println("Amplitude de classes: " + amplitudeClasses);

		// ---------------------------------------------------------------------------------------------------------------------------------------------------------
		
		double[] amplitude = new double[(int) numClasses];
		double amp = mat[0][0];
		System.out.println("Amplitude de Classes: ");
		for (int i = 0; i < amplitude.length; i++) {
			if (i == 0) {
				amplitude[i] = amp + amplitudeClasses;
				BigDecimal valorExato = new BigDecimal(amplitude[i]);
			    valorExato =  valorExato.setScale(precisao,RoundingMode.HALF_DOWN);
			    amplitude[i] = valorExato.doubleValue();
			} else {
				amplitude[i] = amplitude[i - 1] + amplitudeClasses;
				BigDecimal valorExato = new BigDecimal(amplitude[i]);
			    valorExato =  valorExato.setScale(precisao,RoundingMode.HALF_DOWN);
			    amplitude[i] = valorExato.doubleValue();
			}
			System.out.printf("[%d]: %.2f", i,amplitude[i]);
		}
		int a = 0;
		int[] fi = new int[(int) numClasses];
		for (int i = 0; i < fi.length; i++) {
			fi[i] = 0;
		}
		amplitude[(int) (numClasses-1)] = amplitude[(int) (numClasses-1)]*2;
		System.out.println("");
		System.out.println("Frequencia simples de classes");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				while (mat[i][j] >= amplitude[a]) {
					a++;
				}
				fi[a]++;
				a = 0;

			}

		}
		amplitude[(int) (numClasses-1)] = amplitude[(int) (numClasses-1)]/2;
		for (int i = 0; i < fi.length; i++) {
			System.out.print(" [" + i + "]: " + fi[i]);
		}
		System.out.println();
		System.out.println("Frequencia acumulada de classes");
		int[] Fi = new int[(int) numClasses];
		for (int i = 0; i < Fi.length; i++) {
			if (i == 0) {
				Fi[i] = fi[i];
			} else {
				Fi[i] = Fi[i - 1] + fi[i];
			}
			System.out.print(" [" + i + "]: " + Fi[i]);
		}
		System.out.println();
		System.out.println("Frequencia simples relativa de classes");
		double[] fri = new double[(int) numClasses];
		for (int i = 0; i < fri.length; i++) {
			double div = fi[i];
			fri[i] = div / N;
			System.out.printf("[%d]: %.4f ", i, fri[i]);
		}
		System.out.println();
		System.out.println("Frequencia acumulada relativa de classes");
		double[] Fri = new double[(int) numClasses];
		for (int i = 0; i < Fri.length; i++) {
			if (i == 0) {
				Fri[i] = fri[i];
			} else {
				Fri[i] = Fri[i - 1] + fri[i];
			}
			System.out.print(" [" + i + "]: " + Fri[i]);
		}
		System.out.println();
		double[] pontoMedio = new double[(int) numClasses];
		System.out.println("Ponto medio: ");
		for (int i = 0; i < pontoMedio.length; i++) {
			if (i == 0) {
				pontoMedio[i] = (amp + amplitude[i])/2;
			} else {
				pontoMedio[i] = (amplitude[i] + amplitude[i-1])/2;
			}
			System.out.print(" [" + i + "]: " + pontoMedio[i]);
		}
		System.out.println();
		System.out.println("Distribui??o de frequencia: ");
		System.out.println("i Amplitude fi  Fi   fri     Fri     PontoM");
		double[][] distFrequencia = new double[(int)numClasses][7];
		for(int i = 0; i<numClasses; i++) {
			distFrequencia[i][0] =i+1;
			distFrequencia[i][1] = amplitude[i];
			distFrequencia[i][2] = fi[i];
			distFrequencia[i][3] = Fi[i];
			distFrequencia[i][4] = fri[i];
			distFrequencia[i][5] = Fri[i];
			distFrequencia[i][6] = pontoMedio[i];
			System.out.printf("%d | %.2f  | %d | %d | %.3f | %.3f | %.1f |%n",i+1,amplitude[i],fi[i],Fi[i],fri[i],Fri[i],pontoMedio[i]);
		}
		sc.close();
		double media = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				media += mat[i][j];
			}
		}
		System.out.println();
		System.out.println("Media aritm?tica: "+media/(n*m));
}
}