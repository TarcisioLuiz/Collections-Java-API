package list.ordenacao;

import list.pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumero {

    private List<Integer> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }


    public List<Integer> ordenarAscendente() {
        if (!numeros.isEmpty()) {
            Collections.sort(numeros);
            return numeros;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numeros);
        if (!numeros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(35);
        ordenacaoNumero.adicionarNumero(58);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(13);
        ordenacaoNumero.adicionarNumero(64);
        ordenacaoNumero.adicionarNumero(21);
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(37);
        ordenacaoNumero.adicionarNumero(15);

        System.out.println("Ordenação ascendente: " + ordenacaoNumero.ordenarAscendente());
        System.out.println("Ordenação Descendente: " + ordenacaoNumero.ordenarDescendente());
    }
}
