import javax.swing.JOptionPane;

public class calculadoratemp {
    public static void main(String[] args) {

        // seleção
        String[] opcoes = {"Celcius para Fahrenheit", "Fahrenheit para Celcius"};
        int escolha = JOptionPane.showOptionDialog(null, "Selecione a medida da temperatura", "Aperte o botão",
         JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        // System.out.println(escolha);

        // caso
        switch (escolha) {
            case 0:
                // definir o valor da temp em celcius
                String tempS = JOptionPane.showInputDialog("Digite o valor da temperatura em Celcius");
                float temperaturaC = Float.parseFloat(tempS);

                // calcula a temperatura
                float temperaturaF = (temperaturaC*5/9)+32;

                // mensagem gráfica
                JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + temperaturaF);
                break;

            case 1:
                 // definir o valor da temp em fahrenheit
                String tempString = JOptionPane.showInputDialog("Digite o valor da temperatura em Fahrenheit");
                float temperaturaInicialF = Float.parseFloat(tempString);

                // calcula a temperatura
                float temperaturaFinalC = (temperaturaInicialF-32)*5/9;

                // mensagem gráfica
                JOptionPane.showMessageDialog(null, "A temperatura em Celcius é: " + temperaturaFinalC);
            default:
                break;
        }
    }
}
