import javax.swing.JOptionPane;

public class imc {

    public static void main(String[] args) {

        // Inputs
        String pesoS = JOptionPane.showInputDialog("Insira seu peso em kg: ");
        String alturaS = JOptionPane.showInputDialog("Insira sua altura em metros: ");

        // Variaveis
        float peso = Float.parseFloat(pesoS);
        float altura = Float.parseFloat(alturaS);

        // Verificar o IMC
        float imc = peso/ (altura*altura);
        if (imc<= 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso.");
        }
        else if (imc>= 18.6 && imc<=24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal");
        }
        else if (imc>= 25 && imc<=29.9) {
            JOptionPane.showMessageDialog(null, "Levemente acima do peso");
        }
        else if (imc>= 30 && imc<=34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade I");
        }
        else if (imc>= 35 && imc<=39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade II");
        }
        else JOptionPane.showMessageDialog(null, "Obesidade III");
    }
}
