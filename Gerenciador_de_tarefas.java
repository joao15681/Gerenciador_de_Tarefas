import java.util.ArrayList;

public class Gerenciador_de_tarefas {
    
    String nome;
    boolean concluida;

    public Gerenciador_de_tarefas(String nome_da_tarefa) {
        this.nome = nome_da_tarefa;
        this.concluida = false;
    }

    public static void main(String[] args) {
 
        int opcao = 0;
        ArrayList<Gerenciador_de_tarefas> listaDeTarefas = new ArrayList<>();

        while (opcao != 5) {
        System.out.println("Gerenciador de tarefas");
        System.out.println("1- Adicionar tarefa");
        System.out.println("2- Listar tarefas");
        System.out.println("3- Concluir tarefa");
        System.out.println("4- Excluir tarefa");
        System.out.println("5- Sair");
        System.out.print("Escolha uma opção: ");
        opcao = Integer.parseInt(System.console().readLine());

       
        switch (opcao) {
            case 1:

                System.out.print("Digite o nome da tarefa: ");
                String nome_da_tarefa = System.console().readLine();

                Gerenciador_de_tarefas novaTarefa = new Gerenciador_de_tarefas(nome_da_tarefa);

                listaDeTarefas.add(novaTarefa);
                System.out.println("Tarefa '" + novaTarefa.nome + "' criada com sucesso!");

                break;

            case 2:
                System.out.println("Lista de tarefas: ");

                if (listaDeTarefas.isEmpty()){
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Gerenciador_de_tarefas t = listaDeTarefas.get(i);

                        String status = t.concluida ? "Concluída: " : "Pendente: ";

                        System.out.println((i+1) + ". " + status + " " + t.nome);
                    }
                }
                break;
            case 3:
                 System.out.println("\nConcluir tarefa");

                 if (listaDeTarefas.isEmpty()){
                    System.out.println("Nenhuma tarefa para concluir.");
                 }
                 else {
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Gerenciador_de_tarefas t = listaDeTarefas.get(i);
                        String status = t.concluida ? "Concluída" : "Pendente";
                        System.out.println((i+1) + ". " + status + " " + t.nome);
                    }

                    System.out.print("Digite o número da tarefa que deseja concluir: ");
                    int numeroEscolhido= Integer.parseInt(System.console().readLine());

                    int indice = numeroEscolhido - 1;

                    if (indice >= 0 && indice < listaDeTarefas.size()) {
                        Gerenciador_de_tarefas tarefaEscolhida = listaDeTarefas.get(indice);
                        tarefaEscolhida.concluida = true;
                        System.out.println("Tarefa '" + tarefaEscolhida.nome + "' concluída com sucesso!");
                    }
                    else {
                        System.out.println("Número de tarefa inválido.");
                    }
                 }
                break;
            case 4:
              System.out.println("\n Excluir tarefa");

                 if (listaDeTarefas.isEmpty()){
                    System.out.println("Nenhuma tarefa para excluir.");
                 }
                 else {
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        Gerenciador_de_tarefas t = listaDeTarefas.get(i);
                        String status = t.concluida ? "Concluída" : "Pendente";
                        System.out.println((i+1) + ". " + status + " " + t.nome);
                    }

                    System.out.print("Digite o número da tarefa que deseja excluir: ");
                    int numeroEscolhido= Integer.parseInt(System.console().readLine());

                    int indice = numeroEscolhido - 1;

                    if (indice >= 0 && indice < listaDeTarefas.size()) {
                        Gerenciador_de_tarefas tarefaEscolhida = listaDeTarefas.get(indice);
                        listaDeTarefas.remove(indice);
                        System.out.println("Tarefa '" + tarefaEscolhida.nome + "' excluída com sucesso!");
                    }
                    else {
                        System.out.println("Número de tarefa inválido.");
                    }
                 }
                break;
            case 5:
                System.out.println("Sair");
                System.out.println("Saindo do gerenciador de tarefas...");
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida!");
                break;
            }
        }
    }
}
