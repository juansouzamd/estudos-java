package task.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){
           if( t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }
        }

        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDecricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Número total de elementos na lista " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("tarefa 01");
        listaTarefa.adicionarTarefa("tarefa 02");
        listaTarefa.adicionarTarefa("tarefa 03");
        listaTarefa.adicionarTarefa("tarefa 03");
        System.out.println("Número total de elementos na lista " + listaTarefa.obterNumeroTotalDeTarefas());


        listaTarefa.removerTarefa("tarefa 03");
        System.out.println("Número total de elementos na lista " + listaTarefa.obterNumeroTotalDeTarefas());


        listaTarefa.obterDecricoesTarefas();
    }

}
