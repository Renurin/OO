import javax.swing.JOptionPane;

public class pareimpar {
    
    public static void main(String[] args) {
        // Input
        String numeroS = JOptionPane.showInputDialog("Insira um numero: ");
        int numero = Integer.parseInt(numeroS);

        // Teste para even number
        if (numero%2==0) {
            JOptionPane.showMessageDialog(null, "O numero "+numero+" é par.");
        }
        else JOptionPane.showMessageDialog(null, "O numero "+numero+" é ímpar.");
    }
}
