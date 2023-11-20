import javax.swing.JOptionPane;

public class listadetarefas {

    // lista com as lista
    private static String[] lista = new String[100];

    // Metodo adiciona a lista
    static void adiciona(String colocar){
        if(lista[0] == null) {
            lista[0] = "0. "+ colocar;
        }
        else{
            for (int i = 1; i < lista.length; i++) {
                if (lista[i]== null) {
                lista[i]= (int)i+". "+ colocar;
                break;
                }
            }
        }
        //System.out.println(lista[0]);
    }

    // metodo listar a lista
    static void Listar(){
        if (lista != null) {
        JOptionPane.showMessageDialog(null, lista, "lista de atividades", 1);
        }
        else JOptionPane.showMessageDialog(null, "Não há lista");
    }

   // Metodo remove da lista
    static void concluir(int remover){
        if (lista[remover]!=null) {
            String aux = lista[remover];
            JOptionPane.showMessageDialog(null, "Tarefa ("+ aux+ ") foi concluída.");
            lista[remover]= null;
        }
        else JOptionPane.showMessageDialog(null, "Não há tarefas.");
    }


    public static void main(String[] args) {
    // Array de opções
    String[] opcoes = {"Adicionar", "Listar", "Concluir", "Sair"};

    // Loop
    while (true) {
            
    // Ler a opções escolhida
        int escolha = JOptionPane.showOptionDialog(null, "Selecione a tarefa desejada: ", "Aperte o botão",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    
    // case
        switch (escolha) {
            case 0:
                // Adicionar a String lista
                String adicionar = JOptionPane.showInputDialog("Digite a descrição da tarefa: ");
                adiciona(adicionar);
                break;

            case 1:
                // lista as atividades
                Listar();
                break;

            case 2:
              // concluir (remover de lista)
                String removerS = JOptionPane.showInputDialog("Digite o numero da tafera a ser concluída:  ");
                int remover= Integer.parseInt(removerS);
                concluir(remover);
                break;
            case 3:
            break;
            default:
                break;
    }
    if (escolha == 3) {
        break;
    }
    }
    }
}
