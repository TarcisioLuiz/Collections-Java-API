package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public void pesquisarPorPalavra(String palavra) {
        System.out.println(palavrasMap.get(palavra));
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Ética", "Reunião das normas de juízo de valor presentes em uma pessoa, sociedade ou grupo social");
        dicionario.adicionarPalavra("Tempo", "Período sem interrupções no qual os acontecimentos ocorrem");
        dicionario.adicionarPalavra("Dengo", "Meiguice no modo de se comportar");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Tempo");
    }
}
