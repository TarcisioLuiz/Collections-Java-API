package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavrasMap.values()) {
            contagemTotal += contagem;
        }
        System.out.println("A contagem total de palavras é: " + contagemTotal);
    }

    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        contagemLinguagens.exibirContagemPalavras();

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A palavra mais frequente é: " + linguagemMaisFrequente);
    }
}
