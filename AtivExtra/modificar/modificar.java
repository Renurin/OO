package modificar;

import javax.swing.JOptionPane;

public class modificar {
    static void depositar(float mudar, contaBancaria conta){
        conta.setSaldo(mudar);
    }

    public static void main(String[] args) {

        // Inserir saldo inicial
        String saldoString = JOptionPane.showInputDialog("Digite o saldo inicial: ");
        float saldo = Float.parseFloat(saldoString);
        contaBancaria conta = new contaBancaria(saldo);
        
        // Saldo inicial
        JOptionPane.showMessageDialog(null, conta.getSaldo(), "Saldo atual: ", 1);

        // Adicionar saldo
        String depositoString = JOptionPane.showInputDialog("Insira valor para depósito: ");
        float deposito = Float.parseFloat(depositoString);

        depositar(deposito, conta);

        // Saldo atual
        JOptionPane.showMessageDialog(null, conta.getSaldo(),"Novo saldo: ", 1);
    }
}
