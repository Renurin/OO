import javax.swing.JOptionPane;

public class produtovet {
        public static void main(String[] args) {
        // Input
        String tamS = JOptionPane.showInputDialog("Insira o tamanho dos vetores: ");
        int tam = Integer.parseInt(tamS);

        // Definir arrays
        int[] vetor1 = new int[tam];
        int[] vetor2 = new int[tam];
        int[] produto = new int[tam];
        String resposta = "";
        // Input dos vetores
        for (int i = 0; i < vetor1.length; i++) {
            String valorS = JOptionPane.showInputDialog(null, "Elemento "+ i + ": ", "Insira os elementos do primeiro vetor", 1);
            vetor1[i] = Integer.parseInt(valorS);
        }
        for (int i = 0; i < vetor2.length; i++) {
            String valorS = JOptionPane.showInputDialog(null, "Elemento "+ i + ": ", "Insira os elementos do segundo vetor", 1);
            vetor2[i] = Integer.parseInt(valorS);
        }

        // Multiplicar elementos
        for (int i = 0; i < vetor2.length; i++) {
            produto[i] = vetor1[i] * vetor2[i];
        }

        // Print array
        for (int i = 0; i < produto.length; i++) {
            if (i == produto.length-1) {
                resposta = resposta + produto[i];
            }
            else{
            resposta = resposta + produto[i]+", " ;
            }
        }
        JOptionPane.showMessageDialog(null, "["+resposta+"]", "A produto dos vetores", 1);
    }
}
