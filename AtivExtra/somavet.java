
import javax.swing.JOptionPane;

public class somavet {
    public static void main(String[] args) {
        // Input
        String tamS = JOptionPane.showInputDialog("Insira o tamanho dos vetores: ");
        int tam = Integer.parseInt(tamS);

        // Definir arrays
        int[] vetor1 = new int[tam];
        int[] vetor2 = new int[tam];
        int[] soma = new int[tam];
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

        // Somar elementos
        for (int i = 0; i < vetor2.length; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        // Print array
        for (int i = 0; i < soma.length; i++) {
            if (i == soma.length-1) {
                resposta = resposta + soma[i];
            }
            else{
            resposta = resposta + soma[i]+", " ;
            }
        }
        JOptionPane.showMessageDialog(null, "["+resposta+"]", "A soma dos vetores", 1);
    }
}
