package Atividade3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estoque {
    private Map<String, Produto> produtos = new HashMap<>();
    
    public void adicionarProduto(String chave, Produto produto){
        produtos.put(chave, produto);
    }

    public void removerProduto(String chave){
        produtos.remove(chave);
    }

    public void listarProdutos() {
        List<Produto> lista = new ArrayList<>(produtos.values());
        Collections.sort(lista, Comparator.comparingDouble(Produto::getPreco));
        for (Produto p : lista) {
            System.out.println(p.toString());
        }
    }

    public void buscarProdutosPorChave(String chave) {
        List<Map.Entry<String, Produto>> resultados = produtos.entrySet().stream()
            .filter(entry -> entry.getKey().contains(chave))
            .collect(Collectors.toList());

        if (resultados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com a chave: " + chave);
        } else {
            for (Map.Entry<String, Produto> entry : resultados) {
                System.out.println("Chave: " + entry.getKey() + ", Produto: " + entry.getValue());
            }
        }
    }

}
