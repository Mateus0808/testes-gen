package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FuncionarioTest {

    private Funcionario funcionario;

    @Before
    public void setUp() {
        funcionario = new Funcionario("Richiely Batista", "richie", "senha123");
    }

    @Test
    public void testFuncionarioInitialization() {
        assertNotNull("O nome não deve ser nulo", funcionario.getNome());
        assertNotNull("O username não deve ser nulo", funcionario.getUserName());
        assertNotNull("A senha não deve ser nula", funcionario.getSenha());
    }

    @Test
    public void testGetNome() {
        assertEquals("O nome deve ser 'Richiely Batista'", "Richiely Batista", funcionario.getNome());
    }

    @Test
    public void testSetNome() {
        funcionario.setNome("Novo Nome");
        assertEquals("O nome deve ser atualizado para 'Novo Nome'", "Novo Nome", funcionario.getNome());
    }

    @Test
    public void testGetUserName() {
        assertEquals("O username deve ser 'richie'", "richie", funcionario.getUserName());
    }

    @Test
    public void testSetUserName() {
        funcionario.setUserName("novo_username");
        assertEquals("O username deve ser atualizado para 'novo_username'", "novo_username", funcionario.getUserName());
    }

    @Test
    public void testGetSenha() {
        assertEquals("A senha deve ser 'senha123'", "senha123", funcionario.getSenha());
    }

    @Test
    public void testSetSenha() {
        funcionario.setSenha("nova_senha");
        assertEquals("A senha deve ser atualizada para 'nova_senha'", "nova_senha", funcionario.getSenha());
    }

    @Test
    public void testAdicionarProduto() {
        Produto produto = new ProdutoUnitario("Produto 1", "001", 10.0);
        funcionario.adicionarProduto(produto, 5);
        // Você deve verificar se o produto foi adicionado corretamente ao estoque
        assertEquals("O estoque deve ter 5 unidades do produto 001", 5, EstoqueDeProdutos.estoque.get("001").size(), 0.001);
    }

    @Test
    public void testRemoverProduto() {
        Produto produto = new ProdutoUnitario("Produto 1", "001", 10.0);
        funcionario.adicionarProduto(produto, 10);
        funcionario.removerProduto("001", 5);
        // Você deve verificar se o produto foi removido corretamente do estoque
        assertEquals("O estoque deve ter 5 unidades restantes do produto 001", 5, EstoqueDeProdutos.estoque.get("001").size(), 0.001);
    }

    @Test
    public void testMostrarEstoque() {
        // Aqui você pode verificar se o método mostrarEstoque foi chamado corretamente.
        // Pode ser necessário um mock ou outra abordagem para verificar a saída.
        funcionario.mostrarEstoque();
        // Verifique a lógica ou use mocks conforme necessário.
    }
}
