package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProdutoUnitarioTest {

    private ProdutoUnitario produtoUnitario;

    @Before
    public void setUp() {
        produtoUnitario = new ProdutoUnitario("002", "Produto Unitario", 15.0);
    }

    @Test
    public void testCalcularValor() {
        double resultado = produtoUnitario.calcularValor(3);
        assertEquals(45.0, resultado, 0.01); // 3 unidades * 15.0 por unidade
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullCodigo() {
        new ProdutoUnitario(null, "Produto Unitario", 15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyCodigo() {
        new ProdutoUnitario("", "Produto Unitario", 15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullNome() {
        new ProdutoUnitario("002", null, 15.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeValor() {
        new ProdutoUnitario("002", "Produto Unitario", -15.0);
    }
}