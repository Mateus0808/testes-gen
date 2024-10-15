package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoQuiloTest {

    private ProdutoQuilo produtoQuilo;

    @Before
    public void setUp() {
        produtoQuilo = new ProdutoQuilo("001", "Produto Quilo", 20.0, 2.0);
    }

    @Test
    public void testGetQtdQuilos() {
        assertEquals(2.0, produtoQuilo.getQtdQuilos(), 0.01);
    }

    @Test
    public void testSetQtdQuilos() {
        produtoQuilo.setQtdQuilos(3.5);
        assertEquals(3.5, produtoQuilo.getQtdQuilos(), 0.01);
    }

    @Test
    public void testSetQtdQuilosNegative() {
        produtoQuilo.setQtdQuilos(-1.0);
        assertEquals(0.0, produtoQuilo.getQtdQuilos(), 0.01);
    }

    @Test
    public void testCalcularValor() {
        double resultado = produtoQuilo.calcularValor(3);
        assertEquals(60.0, resultado, 0.01); // 3 quilos * 20.0 por quilo
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullCodigo() {
        new ProdutoQuilo(null, "Produto Quilo", 20.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullNome() {
        new ProdutoQuilo("001", null, 20.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeValor() {
        new ProdutoQuilo("001", "Produto Quilo", -20.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNegativeQtdQuilos() {
        new ProdutoQuilo("001", "Produto Quilo", 20.0, -1.0);
    }
}
