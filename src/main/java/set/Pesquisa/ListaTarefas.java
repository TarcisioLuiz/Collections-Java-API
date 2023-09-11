package set.Pesquisa;

import list.operacoesBasicas.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefas> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    private void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefas(descricao, false));
    }

    private void removerTarefa(String descricao) {
        Tarefas tarefaRemovida = null;
        for (Tarefas t : listaTarefa) {
            if (t.getDesc().equalsIgnoreCase(descricao)) {
                tarefaRemovida = t;
            }
        }
        listaTarefa.remove(tarefaRemovida);

        if(tarefaRemovida == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    private void exibirTarefas() {
        System.out.println(listaTarefa);
    }

    private void contarTarefas() {
        System.out.println("Existem " + listaTarefa.size() + " tarefas no conjunto");
    }

    private void obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : listaTarefa) {
            if (t.getConcluida() == true) {
                tarefasConcluidas.add(t);
            }
        }
        System.out.println(tarefasConcluidas);
    }

    private void obterTarefasPendentes() {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas t : listaTarefa) {
            if (t.getConcluida() == false) {
                tarefasPendentes.add(t);
            }
        }
        System.out.println(tarefasPendentes);
    }

    private void marcarTarefaConcluida(String descricao) {
        for (Tarefas t : listaTarefa) {
            if (t.getDesc().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    private void marcarTarefaPendente(String descricao) {
        for (Tarefas t : listaTarefa) {
            if (t.getDesc().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    private void limparListaTarefas() {
        listaTarefa = null;
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");
        listaTarefas.adicionarTarefa("Tarefa 7");
        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 4");
        listaTarefas.marcarTarefaConcluida("Tarefa 6");
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaPendente("Tarefa 4");
        listaTarefas.obterTarefasConcluidas();

        listaTarefas.removerTarefa("Tarefa 7");
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 8");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
