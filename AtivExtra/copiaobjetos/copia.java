package copiaobjetos;

import javax.swing.JOptionPane;

public class copia {
    static Aluno copiar(Aluno obj){
        Aluno copia = new Aluno(null, 0);
        copia.nome = obj.nome;

        return copia;
    }
    
    public static void main(String[] args) {
        // Inputs
        String nome = JOptionPane.showInputDialog("Insira o nome do aluno: ");
        String notaString = JOptionPane.showInputDialog("Insira a nota: ");
        float nota = Float.parseFloat(notaString);

        Aluno aluno = new Aluno(nome, nota);
        
        // Copiar
        Aluno copia = copiar(aluno);

        // Alterar
        String nomeAlt = JOptionPane.showInputDialog("Altere o nome do aluno: ");
        String notaStringAlt = JOptionPane.showInputDialog("Altere a nota do aluno: ");
        float notaAlt = Float.parseFloat(notaStringAlt);

        copia.nome = nomeAlt;
        copia.nota = notaAlt;

        // Printar os 2
        JOptionPane.showMessageDialog(null, aluno.nome + aluno.nota, "Atributos originais: ", 1);
        JOptionPane.showMessageDialog(null, copia.nome + copia.nota, "Atributos alterados", 1);
        
    }
}
