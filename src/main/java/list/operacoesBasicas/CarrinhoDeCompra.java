package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> items;

    public CarrinhoDeCompra() {
        this.items = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        items.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!items.isEmpty()) {
            for (Item i : items) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(i);
                }
            }
            items.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0d;
        if (!items.isEmpty()) {
        for (Item i : items) {
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        System.out.println("Items:");
        for (Item i : items) {
            System.out.print("Nome: " + i.getNome() + ",");
            System.out.print(" Preço: " + i.getPreco() + ",");
            System.out.print(" Quantidade: " + i.getQuantidade());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem("Tomate", 2.50, 3);
        carrinhoDeCompra.adicionarItem("Macarrão", 7.50, 1);
        carrinhoDeCompra.adicionarItem("Queijo", 15.00, 2);
        carrinhoDeCompra.adicionarItem("Manjericão", 3.64, 4);
        carrinhoDeCompra.adicionarItem("Peixe", 22.90, 2);

        carrinhoDeCompra.exibirItens();
        System.out.println("O valor total da compra é: " + carrinhoDeCompra.calcularValorTotal());


        carrinhoDeCompra.removerItem("Manjericão");
        carrinhoDeCompra.exibirItens();
        System.out.println("O valor total da compra é: " + carrinhoDeCompra.calcularValorTotal());
    }
}
