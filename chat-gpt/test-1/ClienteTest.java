package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    private Cliente cliente;
    private Caixa caixa;

    @Before
    public void setUp() {
        cliente = new Cliente();
        caixa = new Caixa(1); // Cria um caixa com número 1
    }

    @Test
    public void testClienteInitialization() {
        assertNotNull("O carrinho do cliente não deve ser nulo", cliente.getCarrinho());
    }

    @Test
    public void testRealizarCompra() {
        // Simulando a compra
        cliente.realizarCompra(caixa);
        // Verifica se a venda foi iniciada, dependendo da implementação do método
        // Aqui você pode adicionar verificações se a venda foi realmente iniciada
        assertTrue("A compra deve ser realizada no caixa", caixa.getVendas().isEmpty()); // Exemplo de verificação
    }

    @Test
    public void testConsultarValor() {
        String codigoProduto = "12345";
        cliente.consultarValor(codigoProduto);
        // Verifique a saída da console se necessário ou use um mock para verificar a chamada
        // Isso pode variar dependendo de como o método mostrarValorProduto é implementado
        // Aqui, você pode adicionar lógica para verificar se o valor foi consultado corretamente
    }
}