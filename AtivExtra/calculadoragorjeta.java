import javax.swing.JOptionPane;

/**
 * calculadoragorjeta
 */
public class calculadoragorjeta {

    public static void main(String[] args) {
        // input conta
        String contaS = JOptionPane.showInputDialog("Digite o valor da conta: ");
        float conta = Float.parseFloat(contaS);

        // input gorgeta
        String gorgetaS = JOptionPane.showInputDialog("Digite o valor da gorgeta: ");
        float gorgeta = Float.parseFloat(gorgetaS);

        // Calcular
        float valorGorgeta = (gorgeta/100)*conta;
        float valorTotal = conta + valorGorgeta;

        // Resultado
        JOptionPane.showMessageDialog(null, "Valor total é: " + valorTotal);    
    }
}