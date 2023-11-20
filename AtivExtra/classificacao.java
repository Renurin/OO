import javax.swing.JOptionPane;

public class classificacao {
    public static void main(String[] args) {
        
                // Vetores de notas
                float[] notas = new float[4];
                float[] pesos = new float[4];
                // Inserções
                for (int i = 1; i < notas.length; i++) {

                    // String
                    String notaString = JOptionPane.showInputDialog("Insira a nota "+i+": ");
                    String pesoString = JOptionPane.showInputDialog("Insira o peso "+i+": ");
                    
                    // Parse float
                    notas[i] = Float.parseFloat(notaString);
                    pesos[i] = Float.parseFloat(pesoString);
                }
                // Calcular notas em centenas
                float media = 0;
                float dividir = 0;
                for (int i = 1; i < 4; i++) {
                    media+= notas[i]*pesos[i];
                    dividir+= pesos[i];
                }
                float notafinal = media/dividir;

                // Classificações
                if (notafinal < 60) {
                    JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal+ ", que corresponde à classificação F");
                }
                else if (notafinal >= 60 &&  notafinal <= 69) {
                    JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal+ ", que corresponde à classificação D");
                }
                else if (notafinal >= 70 && notafinal <= 79) {
                    JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal+ ", que corresponde à classificação C");
                }
                else if (notafinal >= 80 && notafinal <= 89) {
                    JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal+ ", que corresponde à classificação B");
                }
                else JOptionPane.showMessageDialog(null, "Nota final é: "+ notafinal+ ", que corresponde à classificação A");
                

    }
}
