import javax.swing.JOptionPane;

public class palindromo {
    static boolean verificar(String palavra, int comprimento){
        // Verificar se algum elemento é diferente
        for (int i = 0; i < comprimento/2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Input
        String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
        int comprimento = palavra.length();
        
        // If com a função
        if(verificar(palavra, comprimento)){
                JOptionPane.showMessageDialog(null,"A palavra '"+palavra+"'  é um palíndromo" ,  "Palíndromo!", 1);
        }
        else JOptionPane.showMessageDialog(null,"A palavra '"+palavra+"' não é um palíndromo" , "Não é Palíndromo!", 1); 
        }
    }
