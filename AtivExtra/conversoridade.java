import javax.swing.JOptionPane;

public class conversoridade {

    // Idade em mes
    static float converterMes(int idade){
        float idadeMes= idade * 12;
        return idadeMes;
    }

    // Idade em dias
    static float converterDias(int idade){
        float idadeAno = idade * 365;
        return idadeAno;
    }

    // Idade em horas
    static float converterHoras(int idade){
        float idadeHora = idade * 8766;
        return idadeHora;
    }

    // Idade em minutos
    static double converterMinutos(int idade){
        double idadeMinutos = idade * 525.960;
        return idadeMinutos;

    }
    public static void main(String[] args) {

        // Input
        String idadeS = JOptionPane.showInputDialog("Insira sua idade: ");
        int idade = Integer.parseInt(idadeS);

        // Conversores
        float idadeMes = converterMes(idade);
        JOptionPane.showMessageDialog(null, "A idade em meses é: "+ idadeMes);
        
        float idadeDia = converterDias(idade);
        JOptionPane.showMessageDialog(null, "A idade em dias é: "+ idadeDia);

        float idadeHoras= converterHoras(idade);
        JOptionPane.showMessageDialog(null, "A idade em horas é: "+ idadeHoras);

        double idadeMinutos = converterMinutos(idade);
        JOptionPane.showMessageDialog(null, "A idade em minutos é: "+ idadeMinutos);
    }
}
