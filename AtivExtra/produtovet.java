import javax.swing.JOptionPane;

public class produtovet {

        public static void main(String[] args) {
        // Input
        String tamS = JOptionPane.showInputDialog("Insira o tamanho dos vetores: ");
        int tam = Integer.parseInt(tamS);

        // Definir arrays
        float[] vetor1 = new float[tam];
        float[] vetor2 = new float[tam];
        float produto = 0;

        // Input dos vetores
        for (int i = 0; i < vetor1.length; i++) {
            String valorS = JOptionPane.showInputDialog(null, "Elemento "+ i + ": ", "Insira os elementos do primeiro vetor", 1);
            vetor1[i] = Float.parseFloat(valorS);
        }
        for (int i = 0; i < vetor2.length; i++) {
            String valorS = JOptionPane.showInputDialog(null, "Elemento "+ i + ": ", "Insira os elementos do segundo vetor", 1);
            vetor2[i] = Float.parseFloat(valorS);
        }

        // Multiplicar elementos
        for (int i = 0; i < vetor2.length; i++) {
            produto += vetor1[i] * vetor2[i];
        }

        JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: "+ produto);
  
    }
}
