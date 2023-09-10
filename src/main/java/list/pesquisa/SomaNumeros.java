package list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer n : numeros) {
            soma += n;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        Collections.sort(numeros);
        return numeros.get(numeros.size() - 1);
    }

    public int encontrarMenorNumero() {
        Collections.sort(numeros);
        return numeros.get(0);
    }

    public void exibirNumeros() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "numeros= " + numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(58);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(64);
        somaNumeros.adicionarNumero(21);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(37);
        somaNumeros.adicionarNumero(15);

        somaNumeros.exibirNumeros();
        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
}