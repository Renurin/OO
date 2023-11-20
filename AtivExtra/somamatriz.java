import javax.swing.JOptionPane;

public class somamatriz {
    
    public static void main(String[] args) {
        // Input
        String linhasS = JOptionPane.showInputDialog("Digite o numero de linhas: ");
        int linhas = Integer.parseInt(linhasS);
        String colunasS = JOptionPane.showInputDialog("Digite o numero de colunas");
        int colunas =Integer.parseInt(colunasS);

        // Definir as matrizes
        int[][] matriz1 = new int[linhas][colunas];    
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];
        String resposta = "";

        // Matriz 1
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String elementoS = JOptionPane.showInputDialog(null, "Insira o elemento "+i+" "+j, "Matriz 1", 1);
                matriz1[i][j] = Integer.parseInt(elementoS);
            }
        }

        // Matriz 2
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                String elementoS = JOptionPane.showInputDialog(null, "Insira o elemento "+i+" "+j, "Matriz 2", 1);
                matriz2[i][j] = Integer.parseInt(elementoS);
            }
        }

        // Matriz soma
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Print matriz
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resposta += matrizSoma[i][j] +", ";
            }
            resposta += "\n";
        }
        // Resposta
        JOptionPane.showMessageDialog(null, resposta);
    }
}
