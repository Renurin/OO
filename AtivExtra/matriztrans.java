import javax.swing.JOptionPane;

public class matriztrans {

    public static void main(String[] args) {
        // Linhas
        String linhaString = JOptionPane.showInputDialog("Digite o número de linhas da matriz: ");
        int linhas = Integer.parseInt(linhaString);

        // Colunas
        String colunaString = JOptionPane.showInputDialog("Digite o número de colunas da matriz: ");
        int colunas = Integer.parseInt(colunaString);

        // Matriz e resposta
        int[][] matriz = new int[linhas][colunas];
        String resposta = "";
        System.out.println("Digite os elementos da matriz:");

        preencherMatriz(matriz);

        resposta = mostrarMatriz(matriz, resposta);
        JOptionPane.showMessageDialog(null, resposta, "A matriz original é: ", 1);

        int[][] matrizTransposta = transporMatriz(matriz);

        resposta = mostrarMatriz(matrizTransposta, resposta);
        JOptionPane.showMessageDialog(null, resposta, "A matriz transposta é: ", 1);
    }

    // Metodo para inserir os elementos
    public static void preencherMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                String elemento = JOptionPane.showInputDialog("Digite o elemento da posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = Integer.parseInt(elemento);
            }
        }
    }
    // Metodo para transpor a matriz (i,j = j,i)
    public static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] matrizTransposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        return matrizTransposta;
    }

    // Sting resposta
    public static String mostrarMatriz(int[][] matriz, String resposta) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                resposta += resposta + elemento + " ";
            }
            resposta += "\n";
        }
        return resposta;
    }
}