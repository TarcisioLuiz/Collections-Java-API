package set.Ordenacao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadoAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadoAlunos() {
        this.alunosSet = new HashSet<>();
    }

    private void adicionarAluno(String nome, Long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    private void removerAluno(Long matricula) {
        Aluno alunoRemovido = null;
        for (Aluno a : alunosSet) {
            if (a.getMatricula().equals(matricula)) {
                alunoRemovido = a;
            }
        }
        alunosSet.remove(alunoRemovido);

        if (alunoRemovido == null) {
            System.out.println("Aluno não encontrado");
        }
    }

    private void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    private void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    private void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadoAlunos gerenciadoAlunos = new GerenciadoAlunos();

        gerenciadoAlunos.adicionarAluno("Camilla", 202301L, 8d);
        gerenciadoAlunos.adicionarAluno("Giovana", 202302L, 7.5);
        gerenciadoAlunos.adicionarAluno("Júlia", 202303L, 10d);
        gerenciadoAlunos.adicionarAluno("Milena", 202304L, 3d);
        gerenciadoAlunos.adicionarAluno("João", 202305L, 6.5);
        gerenciadoAlunos.adicionarAluno("Lara", 202306L, 9d);
        gerenciadoAlunos.exibirAlunos();

        gerenciadoAlunos.exibirAlunosPorNome();
        gerenciadoAlunos.exibirAlunosPorNota();
    }
}
