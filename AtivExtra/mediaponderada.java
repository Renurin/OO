import javax.swing.JOptionPane;

public class mediaponderada {
    public static void main(String[] args) {
        // Vetores de notas
        float[] notas = new float[3];
        float[] pesos = new float[3];
        // Inserções
        for (int i = 0; i < notas.length; i++) {
            // String
            String notaString = JOptionPane.showInputDialog("Insira a nota: ");
            String pesoString = JOptionPane.showInputDialog("Insira o peso: ");
            
            // Parse float
            notas[i] = Float.parseFloat(notaString);
            pesos[i] = Float.parseFloat(pesoString);
        }
        // calcular notas
        float media = 0;
        float dividir = 0;
        for (int i = 0; i < 3; i++) {
            media+= notas[i]*pesos[i];
            dividir+= pesos[i];
        }
        float notafinal = media/dividir;
        JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal);
    }
}
