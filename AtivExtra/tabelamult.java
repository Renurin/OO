import javax.swing.JOptionPane;

public class tabelamult {
    public static void main(String[] args) {
        // Input
        String numeroS = JOptionPane.showInputDialog(null, "Insira um número para a tabela de multiplicação", "Digite", 0);
        int numero = Integer.parseInt(numeroS);

        // Loop
        for (int i = 1; i < 11; i++) {
            JOptionPane.showMessageDialog(null, i+" x "+numero+ " = "+ i*numero);
        }
    }
}
