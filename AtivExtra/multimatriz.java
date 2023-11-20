
import javax.swing.JOptionPane;

public class multimatriz {
    
    public static void main(String[] args) {

        // Obter o tamanho das matrizes do usuário
        String linhasMatrizAS = JOptionPane.showInputDialog("Digite o numero de linhas da primeira matriz: ");
        int linhasMatrizA = Integer.parseInt(linhasMatrizAS);

        String colunasMatrizAS = JOptionPane.showInputDialog("Digite o numero de colunas da primeira matriz: ");
        int colunasMatrizA = Integer.parseInt(colunasMatrizAS);

        String linhasMatrizBS = JOptionPane.showInputDialog("Digite o numero de linhas da segunda matriz: ");
        int linhasMatrizB = Integer.parseInt(linhasMatrizBS);

        String colunasMatrizBS = JOptionPane.showInputDialog("Digite o numero de colunas da segunda matriz: ");
        int colunasMatrizB = Integer.parseInt(colunasMatrizBS);

        // Verificar se é possível realizar a multiplicação das matrizes
        if (colunasMatrizA != linhasMatrizB) {
            JOptionPane.showMessageDialog(null, "Não é possível multiplicar as matrizes");
            return;
        }

        // Criar as matrizes com os valores inseridos pelo usuário
        int[][] matrizA = new int[linhasMatrizA][colunasMatrizA];
        int[][] matrizB = new int[linhasMatrizB][colunasMatrizB];
        String resposta = "";
        
        preencherMatriz(matrizA);

        preencherMatriz(matrizB);
        

        // Multiplicar as matrizes e mostrar o resultado
        int[][] resultado = multiplicarMatrizes(matrizA, matrizB);

        
        resposta = mostrarMatriz(resultado, resposta);
        JOptionPane.showMessageDialog(null, resposta, "O resultado da multiplicação é: ", 1);
    }

    // Método para preencher os elementos da matriz
    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                String elemento = JOptionPane.showInputDialog("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = Integer.parseInt(elemento);
            }
        }
    }

    // Método para multiplicar as matrizes
    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Método para mostrar a matriz
    public static String mostrarMatriz(int[][] matriz, String resposta) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                resposta += (elemento + " ");
            }
            resposta += "\n";
        }
        return resposta;
    }
}
