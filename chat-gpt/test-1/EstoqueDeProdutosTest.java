package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class EstoqueDeProdutosTest {

    private EstoqueDeProdutos estoque;
    private ProdutoUnitario produtoUnitario;
    private ProdutoQuilo produtoQuilo;

    @Before
    public void setUp() {
        estoque = new EstoqueDeProdutos();
        produtoUnitario = new ProdutoUnitario("001", "Leite", 2.50);
        produtoQuilo = new ProdutoQuilo("002", "Arroz", 5.00, 10.0); // 10 kg
        EstoqueDeProdutos.adicionarProduto(produtoUnitario, 5); // Adicionando 5 unidades de Leite
        EstoqueDeProdutos.adicionarProduto(produtoQuilo, 5); // Adicionando 5 kg de Arroz
    }

    @Test
    public void testAdicionarProdutoUnitario() {
        EstoqueDeProdutos.adicionarProduto(produtoUnitario, 3);
        List<Produto> produtos = EstoqueDeProdutos.estoque.get(produtoUnitario.getCodigo());
        assertEquals(8, produtos.size()); // Verifica se total de produtos é 8
    }

    @Test
    public void testAdicionarProdutoQuilo() {
        EstoqueDeProdutos.adicionarProduto(produtoQuilo, 5); // Adicionando mais 5 kg de Arroz
        List<Produto> produtos = EstoqueDeProdutos.estoque.get(produtoQuilo.getCodigo());
        ProdutoQuilo pQuilo = (ProdutoQuilo) produtos.get(0);
        assertEquals(15.0, pQuilo.getQtdQuilos(), 0.01); // Verifica se total de kg é 15
    }

    @Test
    public void testRemoverProdutoUnitario() {
        EstoqueDeProdutos.removerProduto(produtoUnitario.getCodigo(), 2);
        List<Produto> produtos = EstoqueDeProdutos.estoque.get(produtoUnitario.getCodigo());
        assertEquals(3, produtos.size()); // Verifica se total de produtos é 3
    }

    @Test
    public void testRemoverProdutoQuilo() {
        EstoqueDeProdutos.removerProduto(produtoQuilo.getCodigo(), 3); // Removendo 3 kg
        List<Produto> produtos = EstoqueDeProdutos.estoque.get(produtoQuilo.getCodigo());
        ProdutoQuilo pQuilo = (ProdutoQuilo) produtos.get(0);
        assertEquals(7.0, pQuilo.getQtdQuilos(), 0.01); // Verifica se total de kg é 7
    }

    @Test
    public void testPrecoPorCodigo() {
        double preco = EstoqueDeProdutos.precoPorCodigo(produtoUnitario.getCodigo());
        assertEquals(2.50, preco, 0.01); // Verifica o preço do produto unitário
    }

    @Test
    public void testSeekProduto() {
        Produto produtoEncontrado = EstoqueDeProdutos.seekProduto(produtoUnitario.getCodigo());
        assertNotNull(produtoEncontrado); // Verifica se o produto foi encontrado
        assertEquals(produtoUnitario.getNome(), produtoEncontrado.getNome()); // Verifica se o nome do produto é o mesmo
    }

    @Test
    public void testProdutoParaCompra() {
        boolean podeComprar = EstoqueDeProdutos.produtoParaCompra(produtoUnitario.getCodigo(), 3, true);
        assertTrue(podeComprar); // Verifica se é possível comprar 3 unidades
    }
}
