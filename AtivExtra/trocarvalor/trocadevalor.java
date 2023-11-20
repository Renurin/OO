package trocarvalor;
import javax.swing.JOptionPane;

public class trocadevalor {
    static void trocar(ponto obj1, ponto obj2){

        // Swap
        int tempx= obj1.x;
        int tempy = obj1.y;

        obj1.x = obj2.x;
        obj1.y = obj2.y;

        obj2.x = tempx;
        obj2.y = tempy;
    }

    public static void main(String[] args) {
        // Definir elementos:
        String elementoString = JOptionPane.showInputDialog("Digite um numero para o elemento 1: ");
        int elemento = Integer.parseInt(elementoString);
        String elementoString2 = JOptionPane.showInputDialog("Digite um numero para o elemento 2: ");
        int elemento2 = Integer.parseInt(elementoString2);

        JOptionPane.showMessageDialog(null,"Elementos "+elemento+", "+elemento2+" salvos em obj1", "No objeto obj1: ", 1);

        // Objeto criado
        ponto obj1 = new ponto(elemento, elemento2);
        
         // Definir objeto:
        String elementoString3 = JOptionPane.showInputDialog("Digite um numero para o elemento 3: ");
        int elemento3 = Integer.parseInt(elementoString3);
        String elementoString4 = JOptionPane.showInputDialog("Digite um numero para o elemento 4: ");
        int elemento4 = Integer.parseInt(elementoString4);

        JOptionPane.showMessageDialog(null,"Elementos "+elemento3+", "+elemento4+" salvos em obj2", "No objeto obj2: ", 1);

        // Objeto criado
        ponto obj2 = new ponto(elemento3, elemento4);

        // Printar 
        JOptionPane.showMessageDialog(null, obj1.x+", "+obj1.y, "Elementos do obj1", 1);
        JOptionPane.showMessageDialog(null, obj2.x+", "+obj2.y, "Elementos do obj2", 1);

        trocar(obj1, obj2);
        JOptionPane.showMessageDialog(null, "Agora os objetos são trocados");
        JOptionPane.showMessageDialog(null, obj1.x+", "+obj1.y, "Elementos do obj1", 1);
        JOptionPane.showMessageDialog(null, obj2.x+", "+obj2.y, "Elementos do obj2", 1);

    }
}
