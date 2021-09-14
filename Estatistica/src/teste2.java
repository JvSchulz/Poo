import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		double aux = 0;
		System.out.println("Digite a precisão: ");
		int precisao = sc.nextInt();
		System.out.println("Digite o valor de n e m respectivamente: ");
		n = 1;
		m = 31;
		int N = n * m;
		double mat[][] = {{20,20,25,25,25,25,30,30,30,30,30,30,30,35,35,35,35,35,35,35,35,35,35,40,40,40,45,45,50,50,50}};
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
		System.out.println("Distribuição de frequencia: ");
		System.out.println("i  Amplitude fi  Fi   fri     Fri     PontoM");
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
		
		double media = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				media += mat[i][j];
			}
		}
		System.out.println();
		System.out.println("Media aritmética: "+media/(n*m));
		int nVezes = 1;
        int moda = 0;
        int comparaV = 0;
        int qtdmodas=0;
        Integer Modas[]= new Integer[m];
        for (int p = 0; p < m; p++) {
            nVezes = 1;

            for (int k = p + 1; k < m; k++) {
                if (mat[0][p] == mat[0][k]) {
                    ++nVezes;
                }
            }
            if (nVezes > comparaV) {
                moda = (int) mat[0][p];
                qtdmodas = 0;
                Modas[qtdmodas]=moda;
                comparaV = nVezes;
            }else if(nVezes == comparaV){
                qtdmodas++;
                Modas[qtdmodas]=(int) mat[0][p];
            }
        }
        
        if(qtdmodas>0){
            System.out.print("As modas são");
            for (int j = 0; j <= qtdmodas; j++) {
                if(j==qtdmodas){
                    System.out.println(" e "+Modas[j]+".");
                }else{
                System.out.print(", "+Modas[j]);
                }
            }
            
        }
        else {   		
   		System.out.println("Moda: "+moda);
        }
        
        //Mediana
        if(m%2==0) {
        	int aux1 = m/2;
        	System.out.println("Mediana: "+(mat[0][aux1-1]+mat[0][aux1])/2);
        }
        else {
        	double aux2 = Math.ceil(m/2);
        	System.out.println("Mediana: "+aux2);
        	
        } 
        a=0;
        double[] Q1 = new double[3];
        for(int i = 1;i<4;i++) {
        int classeQ = i*Fi[(int) numClasses-1]/4;
        	while(classeQ>Fi[a]) {
        		a++;
        	}
        	int aux3=classeQ - Fi[a-1];
        	double aux4 = fi[a];
        	double aux5 = aux3/aux4;
        	Q1[i-1] = amplitude[a-1] + aux5*amplitudeClasses;
        	System.out.printf("Quartil%d: %.2f%n",i,Q1[i-1]);
        }
        double aux7=0;
        System.out.println("Medida de quartil: "+(Q1[2]-Q1[0]));
        for(int i = 0; i<m;i++) {
        	 aux7 = aux7 + (mat[0][i] - 34.19)*(mat[0][i] - 34.19);
        }
        System.out.println(aux7);
   		sc.close();
   		}

}
