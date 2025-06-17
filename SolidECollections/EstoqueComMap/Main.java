package EstoqueComMap;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto("Feijao", 5, 10);
        Produto p2 = new Produto("Arroz", 5, 15);
        Produto p3 = new Produto("Refrigerante", 2, 25);

        Estoque estoque = new Estoque();

        estoque.adicionarProduto("001", p1);
        estoque.adicionarProduto("002", p2);
        estoque.adicionarProduto("003", p3);

        System.out.println("Produtos ordenados por preço:");
        estoque.listarProdutos();

        estoque.removerProduto("002");
        System.out.println("Produtos ordenados por preço:");
        estoque.listarProdutos();

        estoque.buscarProdutosPorChave("002");
    }
}
