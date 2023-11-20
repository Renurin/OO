import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {

        // Variaveis em String
        String operadorS1 = JOptionPane.showInputDialog("Insira o primeiro operador: ");
        String operadorS2 = JOptionPane.showInputDialog("Insira o segundo operador: ");

        // Variaveis em float
        float operador1 = Float.parseFloat(operadorS1);
        float operador2 = Float.parseFloat(operadorS2);

        String[] opcoes = {"Adição", "Substração","Multiplicação","Divisão"};
        int escolha = JOptionPane.showOptionDialog(null, "Selecione a operação: ", "Aperte o botão",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                float resposta= operador1 + operador2;
                JOptionPane.showMessageDialog(null, "A adição dos termos é: "+ resposta);
                break;
            case 1:
                float resposta1 = operador1 - operador2;
                JOptionPane.showMessageDialog(null, "A subtração dos termos é: "+ resposta1);
                break;
            case 2:
                float resposta2 = operador1 * operador2;
                JOptionPane.showMessageDialog(null, "A multiplicação dos termos é: "+ resposta2);               break;
            case 3:
                float resposta3 = operador1 / operador2;
                JOptionPane.showMessageDialog(null, "A divisão dos termos é: "+ resposta3);
                break;
            default:
                break;
        }
    }
}
