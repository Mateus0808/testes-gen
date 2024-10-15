package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalancaTest {

    // Testes para o método calcularValorPorPeso
    
    @Test
    public void testCalcularValorPorPeso_ComValoresValidos() {
        double pesoDoProduto = 10.5;
        double quantidade = 2;
        double expected = 21.0;
        double actual = Balanca.calcularValorPorPeso(pesoDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testCalcularValorPorPeso_ComPesoZero() {
        double pesoDoProduto = 0;
        double quantidade = 5;
        double expected = 0.0;
        double actual = Balanca.calcularValorPorPeso(pesoDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testCalcularValorPorPeso_ComQuantidadeZero() {
        double pesoDoProduto = 3.0;
        double quantidade = 0;
        double expected = 0.0;
        double actual = Balanca.calcularValorPorPeso(pesoDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
    
    // Testes para o método calcularValorPorItem
    
    @Test
    public void testCalcularValorPorItem_ComValoresValidos() {
        double valorDoProduto = 15.0;
        int quantidade = 3;
        double expected = 45.0;
        double actual = Balanca.calcularValorPorItem(valorDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testCalcularValorPorItem_ComValorZero() {
        double valorDoProduto = 0;
        int quantidade = 4;
        double expected = 0.0;
        double actual = Balanca.calcularValorPorItem(valorDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
    
    @Test
    public void testCalcularValorPorItem_ComQuantidadeZero() {
        double valorDoProduto = 5.0;
        int quantidade = 0;
        double expected = 0.0;
        double actual = Balanca.calcularValorPorItem(valorDoProduto, quantidade);
        assertEquals(expected, actual, 0.001);
    }
}
