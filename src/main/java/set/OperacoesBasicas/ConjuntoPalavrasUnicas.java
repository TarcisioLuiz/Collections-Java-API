package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public Set<String> getPalavrasUnicasSet() {
        return palavrasUnicasSet;
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }

    }

    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicasSet=" + palavrasUnicasSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas)) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(getPalavrasUnicasSet(), that.getPalavrasUnicasSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavrasUnicasSet());
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("Feijão");
        conjuntoPalavrasUnicas.adicionarPalavra("Batata");
        conjuntoPalavrasUnicas.adicionarPalavra("Arroz");
        conjuntoPalavrasUnicas.adicionarPalavra("Tomate");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra 'Batata' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Batata"));
        System.out.println("A palavra 'Pimentão' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Pimentão"));

        conjuntoPalavrasUnicas.removerPalavra("Tomate");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
