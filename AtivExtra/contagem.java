import javax.swing.JOptionPane;

public class contagem {
    public static void main(String[] args) {
        
        // Insert de numero
        String numeroS = JOptionPane.showInputDialog("Insira um número inicial: ");
        int numero = Integer.parseInt(numeroS);
        while (numero > 0) {
            JOptionPane.showMessageDialog(null, numero);
            numero--;
        }
    }
}
