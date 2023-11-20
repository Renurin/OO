import javax.swing.JOptionPane;

public class adivinha {
    
    public static void main(String[] args) {

        // Definindo max e min
        int numeromax = 10;
        int numeromin = 1;

        // Definindo o random
        JOptionPane.showMessageDialog(null, "Adivinhe o número entre "+numeromin+ " e "+numeromax);
        int random = (int)Math.floor(Math.random()*(numeromax - numeromin + 1)+numeromin);
        
        // auxiliar para contar as tentativas
        int aux = 1;
        
        // Loop
        while(true){
            // Input
            String usuarioS = JOptionPane.showInputDialog(null, "Tentativa "+aux+": ");
            int usuario = Integer.parseInt(usuarioS);

            // Verificar
            if (usuario < random) {
            JOptionPane.showMessageDialog(null, "Tente novamente! O numero é maior");
            }
            else if (usuario > random) {
            JOptionPane.showMessageDialog(null, "Tente novamente! O numero é menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número "+random+" em "+aux+" tentativas.");
                break;
            }
            aux++;
        }
    }
}
